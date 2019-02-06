package de.consol.dus.graal.numbercrunching.fibonacci;

import de.consol.dus.graal.numbercruncing.fibonacci.FibonacciRecursive;

public class FibonacciRecursiveTest extends FibonacciTest {
  @Override
  protected void init() {
    underTest = new FibonacciRecursive();
  }
}