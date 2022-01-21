import java.awt.*;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        int gcd = getGCD(numerator, denominator);
        if (numerator > 0 && denominator < 0) {
            this.numerator = -numerator / gcd;
            this.denominator = -denominator / gcd;
        } else if (numerator < 0 && denominator < 0) {
            this.numerator = -numerator / gcd;
            this.denominator = -denominator / gcd;
        } else {
            this.numerator = numerator / gcd;
            this.denominator = denominator / gcd;
        }
    }

    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    public static Fraction add(Fraction fraction1, Fraction fraction2) {
        int n1 = fraction1.numerator * fraction2.denominator;
        int n2 = fraction2.numerator * fraction1.denominator;
        int d = fraction1.denominator* fraction2.denominator;
        int n = n1 + n2;
        return new Fraction(n, d);
    }

    public static Fraction subtract(Fraction fraction1, Fraction fraction2) {
        int n1 = fraction1.numerator * fraction2.denominator;
        int n2 = fraction2.numerator * fraction1.denominator;
        int d = fraction1.denominator* fraction2.denominator;
        int n = n1 - n2;
        return new Fraction(n, d);
    }

    public static Fraction multiply(Fraction fraction1, Fraction fraction2) {
        int n = fraction1.numerator * fraction2.numerator;
        int d = fraction1.denominator * fraction2.denominator;
        return new Fraction(n, d);
    }

    public static Fraction divide(Fraction fraction1, Fraction fraction2) {
        int n = fraction1.numerator * fraction2.denominator;
        int d = fraction1.denominator * fraction2.numerator;
        return new Fraction(n, d);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String toString() {
        if (Math.abs(numerator) < denominator) {
            return numerator + "/" + denominator;
        } else if(numerator % denominator == 0) {
            return "" + (numerator/denominator);
        } else {
            int front = numerator/denominator;
            int top = numerator - front * denominator;
            return front + " " + (front/Math.abs(front)) * top + "/" + denominator;
        }
    }

    private static int getGCD(int m, int n) {
        int newM;
        int newN;
        while (m % n != 0) {
            newM = m;
            newN = n;
            m = n;
            n = newM % newN;
        }
        return Math.abs(n);
    }
}
