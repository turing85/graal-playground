package de.consol.dus.graal.numbercrunching.fibonacci;

public class CFibonacciIterativeTest extends FibonacciTest {

  @Override
  protected CFibonacciIterative getFreshInstance() {
    return new CFibonacciIterative();
  }
}