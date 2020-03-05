package fraction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FractionTest {

    @Test
    public void additionOfTwoFractionShouldReturnAFraction() {
        Fraction operandA = Fraction.of(0);
        Fraction operandB = Fraction.of(0);
        Fraction result = operandA.add(operandB);
        assertThat(result).isInstanceOf(Fraction.class);
    }

    @Test
    public void additionOfZeroAndZero() {
        Fraction operandA = Fraction.of(0);
        Fraction operandB = Fraction.of(0);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(Fraction.of(0));
    }

    @Test
    public void additionOfZeroAndOneShouldReturnOne() {
        Fraction operandA = Fraction.of(0);
        Fraction operandB = Fraction.of(1);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(Fraction.of(1));
    }

    @Test
    public void additionOfOneAndTwo() {
        Fraction operandA = Fraction.of(1);
        Fraction operandB = Fraction.of(2);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(Fraction.of(3));
    }

    @Test
    public void additionOfZeroAndTwo() {
        Fraction operandA = Fraction.of(0);
        Fraction operandB = Fraction.of(2);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(Fraction.of(2));
    }

    @Test
    public void additionOfOneAndOne() {
        Fraction operandA = Fraction.of(1);
        Fraction operandB = Fraction.of(1);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(Fraction.of(2));
    }

    @Test
    public void additionOfTwoAndOne() {
        Fraction operandA = Fraction.of(2);
        Fraction operandB = Fraction.of(1);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(Fraction.of(3));
    }

    @Test
    public void additionOfOneAndZero() {
        Fraction operandA = Fraction.of(1);
        Fraction operandB = Fraction.of(0);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(Fraction.of(1));
    }

    @Test
    public void additionOfTwoFractionsWithSameDenominator() {
        Fraction operandA = Fraction.of(1, 3);
        Fraction operandB = Fraction.of(1, 3);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(Fraction.of(2, 3));
    }

    @Test
    public void additionOfTwoFractionsWithSameDenominatorCase2() {
        Fraction operandA = Fraction.of(1, 5);
        Fraction operandB = Fraction.of(2, 5);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(Fraction.of(3, 5));
    }


}
