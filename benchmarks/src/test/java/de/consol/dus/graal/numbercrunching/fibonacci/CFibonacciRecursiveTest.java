package de.consol.dus.graal.numbercrunching.fibonacci;

public class CFibonacciRecursiveTest extends FibonacciTest {

  @Override
  protected CFibonacciRecursive getFreshInstance() {
    return new CFibonacciRecursive();
  }
}