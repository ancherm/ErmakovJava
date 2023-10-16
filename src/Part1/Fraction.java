package Part1;

public class Fraction {
    private int num;
    private int denum;
    int newNum;
    int newDenum;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDenum() {
        return denum;
    }

    public void setDenum(int denum) {
        this.denum = denum;
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
        int newNum = this.num + this.denum * number;
        int newDenum = this.denum;
        return new Fraction(newNum, newDenum);
    }

    public Fraction minus(int number) {
        int newNum = this.num - this.denum * number;
        int newDenum = this.denum;
        return new Fraction(newNum, newDenum);
    }

    public Fraction multiplication(int number) {
        int newNum = this.num * number;
        int newDenum = this.denum;
        return new Fraction(newNum, newDenum);
    }

    public Fraction division(int number) {
        int newNum = this.denum * number;
        int newDenum = this.num;
        return new Fraction(newNum, newDenum);
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

    @Override
    public String toString() {
        return num + "/" + denum;
    }
}
