package de.consol.dus.graal.numbercrunching.primenumbers;

public class PrimeNumberArrayListJMH extends PrimeNumberJMH {

  @Override
  protected PrimeNumberArrayList getFreshInstance() {
    return new PrimeNumberArrayList();
  }
}