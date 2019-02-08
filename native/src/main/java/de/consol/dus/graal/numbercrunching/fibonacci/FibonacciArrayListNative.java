package de.consol.dus.graal.numbercrunching.fibonacci;

public class FibonacciArrayListNative extends FibonacciNative {
  public int getNth() {
    return 8388608;
  }

  protected FibonacciArrayList getFreshInstance() {
    return new FibonacciArrayList();
  }

  public static void main(String[] args) {
    new FibonacciArrayListNative().benchmark();
  }
}