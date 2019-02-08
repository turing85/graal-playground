package de.consol.dus.graal.numbercrunching.fibonacci;

public class FibonacciRecursiveNative extends FibonacciNative {
  public int getNth() {
    return 40;
  }

  protected FibonacciRecursive getFreshInstance() {
    return new FibonacciRecursive();
  }

  public static void main(String[] args) {
    new FibonacciRecursiveNative().benchmark();
  }
}