package fraction;

public class Fraction {

    private Integer value;

    public Fraction(Integer value) {
        this.value = value;
    }

    public Fraction add(Fraction f2) {
        return new Fraction(0);
    }

    public Integer getValue() {
        return this.value;
    }
}
