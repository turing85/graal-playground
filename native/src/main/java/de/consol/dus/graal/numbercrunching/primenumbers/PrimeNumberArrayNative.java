package de.consol.dus.graal.numbercrunching.primenumbers;

public class PrimeNumberArrayNative extends PrimeNumberNative {

  @Override
  protected PrimeNumber getFreshInstance() {
    return new PrimeNumberArray();
  }

  public static void main(String[] args) {
    new PrimeNumberArrayNative().benchmark();
  }
}