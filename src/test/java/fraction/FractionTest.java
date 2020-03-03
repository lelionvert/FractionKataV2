package fraction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class FractionTest {

    @Test
    public void additionOfTwoFractionShouldReturnAFraction() {
        Fraction f1 = new Fraction(0);
        Fraction f2 = new Fraction(0);
        Fraction f3 = f1.add(f2);
        assertThat(f3).isInstanceOf(Fraction.class);
    }

    @Test
    public void additionOfZeroAndZero() {
        Fraction f1 = new Fraction(0);
        Fraction f2 = new Fraction(0);
        Fraction f3 = f1.add(f2);
        assertThat(f3.getValue()).isEqualTo(0);
    }

    @Test
    public void additionOfZeroAndOneShouldReturnOne() {
        Fraction f1 = new Fraction(0);
        Fraction f2 = new Fraction(1);
        Fraction f3 = f1.add(f2);
        assertThat(f3.getValue()).isEqualTo(1);
    }
}
