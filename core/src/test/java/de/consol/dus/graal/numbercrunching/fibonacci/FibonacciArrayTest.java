package de.consol.dus.graal.numbercrunching.fibonacci;

import de.consol.dus.graal.numbercruncing.fibonacci.FibonacciArray;

public class FibonacciArrayTest extends FibonacciTest {

  @Override
  protected void init() {
    underTest = new FibonacciArray();
  }
}