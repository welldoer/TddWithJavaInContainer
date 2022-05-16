package net.blogjava.welldoer.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FiberCalculatorTest {
    @Test
    void should_return_1_given_index_1_or_2() {
        assertThat(FiberCalculator.calculate(1)).isEqualTo(1);
        assertThat(FiberCalculator.calculate(2)).isEqualTo(1);
    }
}
