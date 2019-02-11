package de.consol.dus.graal.numbercrunching.fibonacci;

public class JsFibonacciIterativeTest extends FibonacciTest {

  @Override
  protected JsFibonacciIterative getFreshInstance() {
    return new JsFibonacciIterative();
  }
}