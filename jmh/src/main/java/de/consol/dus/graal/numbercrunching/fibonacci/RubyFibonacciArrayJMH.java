package de.consol.dus.graal.numbercrunching.fibonacci;

import org.openjdk.jmh.annotations.Param;

public class RubyFibonacciArrayJMH extends FibonacciJMH {

  @Param("268435456")
  int n;

  @Override
  protected RubyFibonacciArray getFreshInstance() {
    return new RubyFibonacciArray();
  }

  @Override
  public int getN() {
    return n;
  }
}