package de.consol.dus.graal.numbercrunching.primenumbers;

public class PrimeNumberArrayJMH extends PrimeNumberJMH{

  @Override
  protected PrimeNumberArray getFreshInstance() {
    return new PrimeNumberArray();
  }
}