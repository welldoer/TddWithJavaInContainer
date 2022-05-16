package net.blogjava.welldoer.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FiberCalculatorTest {
    @Test
    void should_return_1_given_index_1_or_2() {
        assertThat(FiberCalculator.calculate(1)).isEqualTo(1);
        assertThat(FiberCalculator.calculate(2)).isEqualTo(1);
    }

    @Test
    void should_return_correct_number_given_between_3_or_50() {
        assertThat(FiberCalculator.calculate(10)).isEqualTo(55);
    }

    @Test
    void should_return_12586269025L_given_50() {
        assertThat(FiberCalculator.calculate(50)).isEqualTo(12586269025L);
    }

    @Test
    void should_throw_exception_given_index_below_1() {
        assertThrows(IllegalArgumentException.class, () -> FiberCalculator.calculate(0));
    }
}
