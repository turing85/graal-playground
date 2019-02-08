package de.consol.dus.graal.numbercrunching.fibonacci;

public class FibonacciArrayNative extends FibonacciNative {

  @Override
  protected FibonacciArray getFreshInstance() {
    return new FibonacciArray();
  }

  public static void main(String[] args) {
    new FibonacciArrayNative().benchmark();
  }
}