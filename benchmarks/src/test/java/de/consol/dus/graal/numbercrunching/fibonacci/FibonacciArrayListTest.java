package de.consol.dus.graal.numbercrunching.fibonacci;

import de.consol.dus.graal.numbercruncing.fibonacci.FibonacciArrayList;

public class FibonacciArrayListTest extends FibonacciTest {

  @Override
  protected FibonacciArrayList getFreshInstance() {
    return new FibonacciArrayList();
  }
}