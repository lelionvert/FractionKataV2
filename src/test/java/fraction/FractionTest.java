package fraction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FractionTest {

    @Test
    public void additionOfTwoFractionShouldReturnAFraction() {
        Fraction operandA = new Fraction(0);
        Fraction operandB = new Fraction(0);
        Fraction result = operandA.add(operandB);
        assertThat(result).isInstanceOf(Fraction.class);
    }

    @Test
    public void additionOfZeroAndZero() {
        Fraction operandA = new Fraction(0);
        Fraction operandB = new Fraction(0);
        Fraction result = operandA.add(operandB);
        assertThat(result.getValue()).isEqualTo(0);
    }

    @Test
    public void additionOfZeroAndOneShouldReturnOne() {
        Fraction operandA = new Fraction(0);
        Fraction operandB = new Fraction(1);
        Fraction result = operandA.add(operandB);
        assertThat(result.getValue()).isEqualTo(1);
    }

    @Test
    public void additionOfOneAndTwo(){
        Fraction operandA = new Fraction(1);
        Fraction operandB = new Fraction(2);
        Fraction result = operandA.add(operandB);
        assertThat(result.getValue()).isEqualTo(3);
    }

    @Test
    public void additionOfZeroAndTwo() {
        Fraction operandA = new Fraction(0);
        Fraction operandB = new Fraction(2);
        Fraction result = operandA.add(operandB);
        assertThat(result.getValue()).isEqualTo(2);
    }

    @Test
    public void equalityOfFractions(){
        Fraction fraction = new Fraction(1);
        Fraction fractionWithSameValue = new Fraction(1);
        assertThat(fraction).isEqualTo(fractionWithSameValue);
    }
}
