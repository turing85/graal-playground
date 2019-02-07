package de.consol.dus.graal.numbercrunching.fibonacci;

public class FibonacciArrayTest extends FibonacciTest {

  @Override
  protected FibonacciArray getFreshInstance() {
    return new FibonacciArray();
  }
}