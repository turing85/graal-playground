package de.consol.dus.graal.numbercrunching.fibonacci;

import org.openjdk.jmh.annotations.Param;

public class FibonacciRecursiveJMH extends FibonacciJMH {

  @Param("40")
  private int nth = 0;

  @Override
  protected FibonacciRecursive getFreshInstance() {
    return new FibonacciRecursive();
  }

  @Override
  public int getNth() {
    return nth;
  }
}