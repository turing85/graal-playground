package de.consol.dus.graal.numbercrunching.fibonacci;

import org.openjdk.jmh.annotations.Param;

public class FibonacciArrayListJMH extends FibonacciJMH {

  @Param("8388608")
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