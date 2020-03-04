package fraction;

public class Fraction {

    private Integer value;

    public Fraction(Integer value) {
        this.value = value;
    }

    public Fraction add(Fraction other) {
        if (other.getValue() != 0) {
            return other;
        }

        return new Fraction(0);
    }

    public Integer getValue() {
        return this.value;
    }
}
