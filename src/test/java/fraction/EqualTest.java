package fraction;

import org.junit.jupiter.api.Test;

import static fraction.Fraction.fraction;
import static fraction.Fraction.integerFraction;
import static org.assertj.core.api.Assertions.assertThat;

public class EqualTest {
    @Test
    public void equalityOfFractions(){
        Fraction fraction = integerFraction(1);
        Fraction fractionWithSameValue = integerFraction(1);
        assertThat(fraction).isEqualTo(fractionWithSameValue);
    }

    @Test
    public void inEqualityOfTwoFraction(){
        Fraction fraction = integerFraction(1);
        Fraction anotherFraction = integerFraction(2);
        assertThat(fraction).isNotEqualTo(anotherFraction);

    }

    @Test
    public void inequalityOfAnythingNotAFraction(){
        Fraction fraction = integerFraction(1);
        Integer otherObject = 1;
        assertThat(fraction).isNotEqualTo(otherObject);
    }

    @Test
    public void inequalityOfTwoInstancesOfDifferentConstructors(){
        Fraction fractionWithOneArgument = integerFraction(1);
        Fraction fractionWithTwoArguments = fraction(1, 2);
        assertThat(fractionWithOneArgument).isNotEqualTo(fractionWithTwoArguments);
    }

    @Test
    public void equalityOfOneHalfAndOneHalf(){
        Fraction firstHalf = fraction(1, 2);
        Fraction secondHalf = fraction(1, 2);
        assertThat(firstHalf).isEqualTo(secondHalf);
    }


}
