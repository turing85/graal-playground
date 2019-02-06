package de.consol.dus.graal.numbercruncing.fibonacci;

import org.openjdk.jmh.annotations.Param;

public class FibonacciArrayListJMH extends FibonacciJMH {

  @Param("40")
  private int n = 0;

  @Override
  protected FibonacciArrayList getFreshInstance() {
    return new FibonacciArrayList();
  }

  @Override
  public int getN() {
    return n;
  }
}