package de.consol.dus.graal.numbercrunching.fibonacci;

public class FibonacciArrayNative extends FibonacciNative {
  public int getNth() {
    return 268435456;
  }

  protected Fibonacci getFreshInstance() {
    return new FibonacciArray();
  }

  public static void main(String[] args) {
    new FibonacciArrayNative().benchmark();
  }
}
