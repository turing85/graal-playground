package de.consol.dus.graal.numbercrunching.fibonacci;

import org.openjdk.jmh.annotations.Param;

public class FibonacciArrayJMH extends FibonacciJMH {

  @Param("268435456")
  private int n = 0;

  @Override
  protected FibonacciArray getFreshInstance() {
    return new FibonacciArray();
  }

  @Override
  public int getN() {
    return n;
  }
}