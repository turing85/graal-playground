package de.consol.dus.graal.numbercrunching.fibonacci;

public class FibonacciRecursiveNative extends FibonacciNative {

  public static final int NTH = 40;

  @Override
  public int getNth() {
    return NTH;
  }

  @Override
  protected FibonacciRecursive getFreshInstance() {
    return new FibonacciRecursive();
  }

  public static void main(String[] args) {
    new FibonacciRecursiveNative().benchmark();
  }
}