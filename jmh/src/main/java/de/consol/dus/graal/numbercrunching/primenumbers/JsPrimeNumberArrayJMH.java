package de.consol.dus.graal.numbercrunching.primenumbers;

public class JsPrimeNumberArrayJMH extends PrimeNumberJMH{

  @Override
  protected JsPrimeNumberArray getFreshInstance() {
    return new JsPrimeNumberArray();
  }
}