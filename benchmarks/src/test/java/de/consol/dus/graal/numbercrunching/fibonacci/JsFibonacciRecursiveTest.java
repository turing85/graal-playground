package de.consol.dus.graal.numbercrunching.fibonacci;

public class JsFibonacciRecursiveTest extends FibonacciTest {

  @Override
  protected JsFibonacciRecursive getFreshInstance() {
    return new JsFibonacciRecursive();
  }
}