package fraction;

public class Fraction {

    private static final Integer DEFAULT_DENOMINATOR = 1;

    private Integer numerator;
    private Integer denominator;

    private Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static Fraction integerFraction(Integer numerator) {
        return fraction(numerator, DEFAULT_DENOMINATOR);
    }

    public static Fraction fraction(Integer numerator, Integer denominator) {
        return new Fraction(numerator, denominator);
    }

    public Fraction add(Fraction other) {
        if (!this.denominator.equals(other.denominator)) {
            return this.add(fraction(other.numerator * this.denominator, this.denominator));
        }
        return fraction(this.numerator + other.numerator, this.denominator);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;

            return other.numerator.equals(this.numerator)
                    && other.denominator.equals(this.denominator);

        }
        return false;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
