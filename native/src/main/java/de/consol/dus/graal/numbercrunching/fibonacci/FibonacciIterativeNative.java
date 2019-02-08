package de.consol.dus.graal.numbercrunching.fibonacci;

public class FibonacciIterativeNative extends FibonacciNative {

  @Override
  protected FibonacciIterative getFreshInstance() {
    return new FibonacciIterative();
  }

  public static void main(String[] args) {
    new FibonacciIterativeNative().benchmark();
  }
}