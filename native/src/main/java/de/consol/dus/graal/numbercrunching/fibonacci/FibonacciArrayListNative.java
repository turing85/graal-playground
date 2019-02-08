package de.consol.dus.graal.numbercrunching.fibonacci;

public class FibonacciArrayListNative extends FibonacciNative {

  public static final int NTH = 8_388_608;

  @Override
  public int getNth() {
    return NTH;
  }

  @Override
  protected FibonacciArrayList getFreshInstance() {
    return new FibonacciArrayList();
  }

  public static void main(String[] args) {
    new FibonacciArrayListNative().benchmark();
  }
}