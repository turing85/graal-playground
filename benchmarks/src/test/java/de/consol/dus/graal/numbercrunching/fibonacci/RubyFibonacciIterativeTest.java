package de.consol.dus.graal.numbercrunching.fibonacci;

public class RubyFibonacciIterativeTest extends FibonacciTest {

  @Override
  protected RubyFibonacciIterative getFreshInstance() {
    return new RubyFibonacciIterative();
  }
}