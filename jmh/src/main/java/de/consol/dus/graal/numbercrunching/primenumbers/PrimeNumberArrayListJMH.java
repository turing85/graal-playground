package de.consol.dus.graal.numbercrunching.primenumbers;

import org.openjdk.jmh.annotations.Param;

public class PrimeNumberArrayListJMH extends PrimeNumberJMH{

  @Param("500000")
  private int nth = 0;

  @Override
  protected PrimeNumberArrayList getFreshInstance() {
    return new PrimeNumberArrayList();
  }

  public int getNth() {
    return nth;
  }
}