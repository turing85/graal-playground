package de.consol.dus.graal.numbercrunching.fibonacci;

import org.openjdk.jmh.annotations.Param;

public class CFibonacciRecursiveJMH extends FibonacciJMH {

  @Param("40")
  int n;

  @Override
  protected CFibonacciRecursive getFreshInstance() {
    return new CFibonacciRecursive();
  }

  @Override
  public int getN() {
    return n;
  }
}