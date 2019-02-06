package de.consol.dus.graal.numbercrunching.fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import de.consol.dus.graal.numbercruncing.fibonacci.Fibonacci;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

@DisplayName("Test for Fibonacci calculation")
public abstract class FibonacciTest {

  Fibonacci underTest;

  @BeforeEach
  final void setup() {
    init();
  }

  protected abstract void init();

  @Nested
  @DisplayName("Sanity test")
  class SanityTest {

    @ParameterizedTest(name = "{0}th fibonacci should be {1}")
    @CsvFileSource(resources = "/fibonacci/testValues.csv")
    void test_shouldReturnSecondArgument_whenCalledWithFirstArgument(int nth, long expected) {
      // Given: nothing

      // When:
      long actual = underTest.calculateNthFibonacci(nth);

      // Then:
      assertEquals(expected, actual);
    }
  }
}