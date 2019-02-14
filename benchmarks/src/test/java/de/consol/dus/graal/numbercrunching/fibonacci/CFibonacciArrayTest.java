package de.consol.dus.graal.numbercrunching.fibonacci;

public class CFibonacciArrayTest extends FibonacciTest {

  @Override
  protected CFibonacciArray getFreshInstance() {
    return new CFibonacciArray();
  }
}