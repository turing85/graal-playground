package de.consol.dus.graal.numbercrunching.primenumbers;

public class PrimeNumberArrayListNative extends PrimeNumberNative {

  @Override
  protected PrimeNumber getFreshInstance() {
    return new PrimeNumberArrayList();
  }

  public static void main(String[] args) {
    new PrimeNumberArrayListNative().benchmark();
  }
}