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

    public static Fraction of(Integer numerator) {
        return of(numerator,1);
    }

    public Fraction add(Fraction other) {
        return of(this.numerator + other.numerator, this.denominator);
    }

    public static Fraction of(Integer numerator, Integer denominator) {
        return new Fraction(numerator, denominator);
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
