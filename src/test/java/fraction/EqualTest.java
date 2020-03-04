package fraction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EqualTest {
    @Test
    public void equalityOfFractions(){
        Fraction fraction = new Fraction(1);
        Fraction fractionWithSameValue = new Fraction(1);
        assertThat(fraction).isEqualTo(fractionWithSameValue);
    }

    @Test
    public void inEqualityOfTwoFraction(){
        Fraction fraction = new Fraction(1);
        Fraction anotherFraction = new Fraction(2);
        assertThat(fraction).isNotEqualTo(anotherFraction);

    }

    @Test
    public void inequalityOfAnythingNotAFraction(){
        Fraction fraction = new Fraction(1);
        Integer otherObject = 1;
        assertThat(fraction).isNotEqualTo(otherObject);
    }


}
