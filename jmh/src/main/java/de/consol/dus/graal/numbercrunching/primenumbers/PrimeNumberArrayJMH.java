package de.consol.dus.graal.numbercrunching.primenumbers;

import org.openjdk.jmh.annotations.Param;

public class PrimeNumberArrayJMH extends PrimeNumberJMH{

  @Param("500000")
  private int nth = 0;

  @Override
  protected PrimeNumberArray getFreshInstance() {
    return new PrimeNumberArray();
  }

  public int getNth() {
    return nth;
  }
}