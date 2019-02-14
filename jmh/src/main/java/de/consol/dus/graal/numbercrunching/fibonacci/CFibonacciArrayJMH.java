package de.consol.dus.graal.numbercrunching.fibonacci;

import org.openjdk.jmh.annotations.Param;

public class CFibonacciArrayJMH extends FibonacciJMH {

  @Param("268435456")
  int n;

  @Override
  protected CFibonacciArray getFreshInstance() {
    return new CFibonacciArray();
  }

  @Override
  public int getN() {
    return n;
  }
}