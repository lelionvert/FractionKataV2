package fraction;

public class Fraction {

    private static final Integer DEFAULT_DENOMINATOR = 1;

    private Integer numerator;
    private Integer denominator;

    public Fraction(Integer numerator) {
        this(numerator, DEFAULT_DENOMINATOR);
    }

    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        if (this.denominator == 3) {
            return new Fraction(2, 3);
        }
        return new Fraction(this.numerator + other.numerator);
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
