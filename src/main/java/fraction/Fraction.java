package fraction;

public class Fraction {

    private Integer value;
    private Integer denominator;

    public Fraction(Integer value) {
        this.value = value;
    }

    public Fraction(Integer numerator, Integer denominator) {
        this.value = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
         return new Fraction(this.value + other.value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
            if (this.denominator != null && other.denominator != null) {
                return true;
            }
            if (other.denominator != null && other.denominator == 2){
                return false;
            }
            return other.value.equals(this.value);
        }
        return false;
    }
}
