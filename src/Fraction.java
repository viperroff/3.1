public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int number) {
        this(number, 1);
    }

    public Fraction sum(int number) {
        return new Fraction(this.numerator + (number * this.denominator), this.denominator);
    }

    public Fraction minus(int number) {
        return new Fraction(this.numerator - (number * this.denominator), this.denominator);
    }

    public Fraction multiply(int number) {
        return new Fraction(this.numerator * number, this.denominator);
    }

    public Fraction div(int number) {
        if (number == 0) {
            throw new ArithmeticException("Нельзя делить на ноль");
        }
        return new Fraction(this.numerator, this.denominator * number);
    }

    public Fraction sum(Fraction fraction) {
        int newNumerator = (this.numerator * fraction.denominator) + (fraction.numerator * this.denominator);
        int newDenominator = this.denominator * fraction.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction minus(Fraction fraction) {
        int newNumerator = (this.numerator * fraction.denominator) - (fraction.numerator * this.denominator);
        int newDenominator = this.denominator * fraction.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiplication(Fraction fraction) {
        int newNumerator = this.numerator * fraction.numerator;
        int newDenominator = this.denominator * fraction.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction div(Fraction fraction) {
        if (fraction.numerator == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        int newNumerator = this.numerator * fraction.denominator;
        int newDenominator = this.denominator * fraction.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}