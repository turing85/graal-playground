package de.consol.dus.graal.numbercrunching.fibonacci;

import org.openjdk.jmh.annotations.Param;

public class FibonacciArrayListJMH extends FibonacciJMH {

  @Param("8388608")
  private int nth = 0;

  @Override
  protected FibonacciArrayList getFreshInstance() {
    return new FibonacciArrayList();
  }

  @Override
  public int getNth() {
    return nth;
  }
}