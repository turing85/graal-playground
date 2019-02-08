package de.consol.dus.graal.numbercrunching.fibonacci;

import java.io.IOException;

public class JsFibonacciIterativeNative extends FibonacciNative {

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

  public static void main(String[] args) {
    new JsFibonacciIterativeNative().benchmark();
  }
}