package de.consol.dus.graal.numbercrunching.fibonacci;

import de.consol.dus.graal.numbercruncing.fibonacci.FibonacciIterative;

public class FibonacciIterativeTest extends FibonacciTest {

  @Override
  protected void init() {
    underTest = new FibonacciIterative();
  }
}