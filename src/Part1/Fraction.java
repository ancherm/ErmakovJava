package Part1;

public class Fraction {
    private final int num;
    private final int denum;

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

//    public void setNum(int num) {
//        this.num = num;
//    }

    public int getDenum() {
        return denum;
    }

//    public void setDenum(int denum) {
//        this.denum = denum;
//    }


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

    @Override
    public String toString() {
        return num + "/" + denum;
    }
}
