package de.consol.dus.graal.numbercrunching.primenumbers;

import de.consol.dus.graal.AbstractBenchmark;
import org.openjdk.jmh.annotations.Param;

public abstract class PrimeNumberJMH extends AbstractBenchmark {

  @Param("500000")
  private int nth = 0;

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

  public int getNth() {
    return nth;
  }

  protected abstract PrimeNumber getFreshInstance();
}