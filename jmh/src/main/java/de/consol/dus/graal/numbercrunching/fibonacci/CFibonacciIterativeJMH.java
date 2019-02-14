package de.consol.dus.graal.numbercrunching.fibonacci;

import org.openjdk.jmh.annotations.Param;

public class CFibonacciIterativeJMH extends FibonacciJMH {

  @Param("268435456")
  int n;

  @Override
  protected CFibonacciIterative getFreshInstance() {
    return new CFibonacciIterative();
  }

  @Override
  public int getN() {
    return n;
  }
}