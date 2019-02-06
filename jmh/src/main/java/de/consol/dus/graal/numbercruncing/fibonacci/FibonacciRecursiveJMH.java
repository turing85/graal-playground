package de.consol.dus.graal.numbercruncing.fibonacci;

import org.openjdk.jmh.annotations.Param;

public class FibonacciRecursiveJMH extends FibonacciJMH {

  @Param("40")
  private int n = 0;

  @Override
  protected FibonacciRecursive getFreshInstance() {
    return new FibonacciRecursive();
  }

  @Override
  public int getN() {
    return n;
  }
}