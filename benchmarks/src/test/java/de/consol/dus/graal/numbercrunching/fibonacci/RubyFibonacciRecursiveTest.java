package de.consol.dus.graal.numbercrunching.fibonacci;

public class RubyFibonacciRecursiveTest extends FibonacciTest {

  @Override
  protected RubyFibonacciRecursive getFreshInstance() {
    return new RubyFibonacciRecursive();
  }
}