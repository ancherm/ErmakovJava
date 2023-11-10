package ru.chermashentsev.etc;


import lombok.*;

import java.util.ArrayList;
import java.util.List;

public final class Fraction extends Number{
    private final int num;
    private final int denum;

//    public static Fraction create(int num, int denum) {
//        Fraction(num, denum);
//    }

    public Fraction(int num, int denum) {
        if (denum <= 0) {
            throw new IllegalArgumentException("Числитель равен нулю или отрицателен");
        }
        this.num = num;
        this.denum = denum;
    }

    public int getNum() {
        return num;
    }


    public int getDenum() {
        return denum;
    }


    public Fraction plus(Fraction fraction) {
        int newNum = this.num * fraction.denum + this.denum * fraction.num;
        int newDenum = this.denum * fraction.denum;
        return new Fraction(newNum, newDenum);
    }

    public Fraction minus(Fraction fraction) {
        int newNum = this.num * fraction.denum - this.denum * fraction.num;
        int newDenum = this.denum * fraction.denum;
        return new Fraction(newNum, newDenum);
    }

    public Fraction multiplication(Fraction fraction) {
        int newNum = this.num * fraction.num;
        int newDenum = this.denum * fraction.denum;
        return new Fraction(newNum, newDenum);
    }

    public Fraction division(Fraction fraction) {
        int newNum = this.num * fraction.denum;
        int newDenum = this.denum * fraction.num;
        return new Fraction(newNum, newDenum);
    }

    public Fraction plus(int number) {
        return plus(new Fraction(number, 1));
    }

    public Fraction minus(int number) {

        return minus(new Fraction(number, 1));
    }

    public Fraction multiplication(int number) {
        return multiplication(new Fraction(number, 1));
    }

    public Fraction division(int number) {
        return division(new Fraction(number, 1));
    }


    public String printWhitPlus(Fraction fraction) {
        return this + " + " + fraction + " = " + plus(fraction);
    }

    public String printWhitMinus(Fraction fraction) {
        return this + " - " + fraction + " = " + minus(fraction);
    }

    public String printWhitMultiplication(Fraction fraction) {
        return this + " * " + fraction + " = " + multiplication(fraction);
    }

    public String printWhitDivision(Fraction fraction) {
        return this + " : " + fraction + " = " + division(fraction);
    }

    public String printWhitPlus(int number) {
        return printWhitPlus(new Fraction(number, 1));
    }

    public String printWhitMinus(int number) {
        return printWhitMinus(new Fraction(number, 1));
    }

    public String printWhitMultiplication(int number) {
        return printWhitMultiplication(new Fraction(number, 1));
    }

    public String printWhitDivision(int number) {
        return printWhitDivision(new Fraction(number, 1));
    }

    public Fraction simplifyFraction() {
        int gcd = euclideanAlgorithm(Math.abs(num), Math.abs(denum));

        int simplifiedNum = num / gcd;
        int simplifiedDenum = denum / gcd;

        return new Fraction(simplifiedNum, simplifiedDenum);
    }

    private int euclideanAlgorithm(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    @Override
    public int intValue() {
        return num / denum;
    }

    @Override
    public long longValue() {
        return num / denum;
    }

    @Override
    public float floatValue() {
        return (float) num / (float) denum;
    }

    @Override
    public double doubleValue() {
        return (float) num / (float) denum;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Fraction fraction = (Fraction) obj;

        Fraction fractionThis = this.simplifyFraction();
        Fraction fractionObj = fraction.simplifyFraction();

        return fractionThis.num == fractionObj.num && fractionThis.denum == fractionObj.denum;
    }

    @Override
    public String toString() {
        return num + "/" + denum;
    }
}
