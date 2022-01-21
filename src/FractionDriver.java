public class FractionDriver {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(-9, 4);
        Fraction f2 = new Fraction(37, -36);
        System.out.println(f1.getNumerator());
        System.out.println(f1.getDenominator());
        System.out.println(f1);
        System.out.println(f2.getNumerator());
        System.out.println(f2.getDenominator());
        System.out.println(f2);
        Fraction f3 = Fraction.add(f1, f2);
        Fraction f4 = Fraction.subtract(f1, f2);
        Fraction f5 = Fraction.multiply(f1, f2);
        Fraction f6 = Fraction.divide(f1, f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);
    }
}
