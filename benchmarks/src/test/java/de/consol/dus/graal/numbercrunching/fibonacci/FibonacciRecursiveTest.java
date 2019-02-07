package de.consol.dus.graal.numbercrunching.fibonacci;

public class FibonacciRecursiveTest extends FibonacciTest {
  @Override
  protected FibonacciRecursive getFreshInstance() {
    return new FibonacciRecursive();
  }
}