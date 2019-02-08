package de.consol.dus.graal.numbercrunching.fibonacci;

import java.io.IOException;

public class JsFibonacciIterativeTest extends FibonacciTest {

  @Override
  protected JsFibonacciIterative getFreshInstance() {
    try {
      return new JsFibonacciIterative();
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(42);
    }
    return null;
  }
}