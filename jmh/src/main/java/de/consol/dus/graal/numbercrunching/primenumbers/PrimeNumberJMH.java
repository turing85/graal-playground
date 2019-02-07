package de.consol.dus.graal.numbercrunching.primenumbers;

import de.consol.dus.graal.AbstractBenchmark;

public abstract class PrimeNumberJMH extends AbstractBenchmark {

  private PrimeNumber primeNumber;

  @Override
  public final void setup() {
    primeNumber = getFreshInstance();
  }

  @Override
  public final void tearDown() {
    primeNumber = null;
  }

  @Override
  public void execute() {
    primeNumber.getNthPrime(getNth());
  }

  protected abstract PrimeNumber getFreshInstance();

  public abstract int getNth();
}