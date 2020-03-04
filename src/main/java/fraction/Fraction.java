package fraction;

public class Fraction {

    private Integer value;

    public Fraction(Integer value) {
        this.value = value;
    }

    public Fraction add(Fraction other) {
         return new Fraction(this.value + other.value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
            return other.value.equals(this.value);
        }
        return false;
    }
}
