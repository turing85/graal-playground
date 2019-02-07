package de.consol.dus.graal.numbercrunching.fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

@DisplayName("Test for Fibonacci calculation")
public abstract class FibonacciTest {

  private Fibonacci underTest;

  @BeforeEach
  final void setup() {
    this.underTest = getFreshInstance();
  }

  protected abstract Fibonacci getFreshInstance();

  protected void setUnderTest(Fibonacci underTest) {
    this.underTest = underTest;
  }

  Fibonacci getUnderTest() {
    return underTest;
  }

  @Nested
  @DisplayName("Sanity test")
  class SanityTest {

    @ParameterizedTest(name = "{0}th fibonacci should be {1}")
    @CsvFileSource(resources = "/fibonacci/testValues.csv")
    void test_shouldReturnSecondArgument_whenCalledWithFirstArgument(int nth, long expected) {
      // Given: nothing

      // When:
      long actual = getUnderTest().calculateNthFibonacci(nth);

      // Then:
      assertEquals(expected, actual);
    }
  }
}