package fraction;

import org.junit.jupiter.api.Test;

import static fraction.Fraction.fraction;
import static fraction.Fraction.integerFraction;
import static org.assertj.core.api.Assertions.assertThat;

public class FractionTest {

    @Test
    public void additionOfTwoFractionShouldReturnAFraction() {
        Fraction operandA = integerFraction(0);
        Fraction operandB = integerFraction(0);
        Fraction result = operandA.add(operandB);
        assertThat(result).isInstanceOf(Fraction.class);
    }

    @Test
    public void additionOfZeroAndZero() {
        Fraction operandA = integerFraction(0);
        Fraction operandB = integerFraction(0);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(integerFraction(0));
    }

    @Test
    public void additionOfZeroAndOneShouldReturnOne() {
        Fraction operandA = integerFraction(0);
        Fraction operandB = integerFraction(1);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(integerFraction(1));
    }

    @Test
    public void additionOfOneAndTwo() {
        Fraction operandA = integerFraction(1);
        Fraction operandB = integerFraction(2);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(integerFraction(3));
    }

    @Test
    public void additionOfZeroAndTwo() {
        Fraction operandA = integerFraction(0);
        Fraction operandB = integerFraction(2);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(integerFraction(2));
    }

    @Test
    public void additionOfOneAndOne() {
        assertThat(integerFraction(1).add(integerFraction(1)))
                .isEqualTo(integerFraction(2));
    }

    @Test
    public void additionOfTwoAndOne() {
        Fraction operandA = integerFraction(2);
        Fraction operandB = integerFraction(1);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(integerFraction(3));
    }

    @Test
    public void additionOfOneAndZero() {
        Fraction operandA = integerFraction(1);
        Fraction operandB = integerFraction(0);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(integerFraction(1));
    }

    @Test
    public void additionOfTwoFractionsWithSameDenominator() {
        Fraction operandA = fraction(1, 3);
        Fraction operandB = fraction(1, 3);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(fraction(2, 3));
    }

    @Test
    public void additionOfTwoFractionsWithSameDenominatorCase2() {
        Fraction operandA = fraction(1, 5);
        Fraction operandB = fraction(2, 5);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(fraction(3, 5));
    }

    @Test
    public void additionOfFractionAndInteger() {
        Fraction operandA = fraction(1, 3);
        Fraction operandB = integerFraction(1);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(fraction(4, 3));
    }

    @Test
    public void additionOfFractionAndIntegerCase2() {
        Fraction operandA = fraction(1, 3);
        Fraction operandB = integerFraction(2);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(fraction(7, 3));
    }

    @Test
    public void additionOfFractionAndIntegerCase3() {
        Fraction operandA = fraction(1, 5);
        Fraction operandB = integerFraction(1);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(fraction(6, 5));
    }

    @Test
    public void additionOfIntegerAndFractionCase1(){
        Fraction operandA = integerFraction(1);
        Fraction operandB = fraction(1, 5);
        Fraction result = operandA.add(operandB);
        assertThat(result).isEqualTo(fraction(6, 5));

    }
}
