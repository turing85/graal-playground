package de.consol.dus.graal.numbercrunching.fibonacci;

public class FibonacciIterativeNative extends FibonacciNative {
  public int getNth() {
    return 268435456;
  }

  protected FibonacciIterative getFreshInstance() {
    return new FibonacciIterative();
  }

  public static void main(String[] args) {
    new FibonacciIterativeNative().benchmark();
  }
}