package de.consol.dus.graal.numbercrunching.primenumbers;

public class RubyPrimeNumberArrayJMH extends PrimeNumberJMH{

  @Override
  protected RubyPrimeNumberArray getFreshInstance() {
    return new RubyPrimeNumberArray();
  }
}