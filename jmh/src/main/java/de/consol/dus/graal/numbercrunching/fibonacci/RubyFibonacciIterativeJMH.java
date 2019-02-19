package de.consol.dus.graal.numbercrunching.fibonacci;

import org.openjdk.jmh.annotations.Param;

public class RubyFibonacciIterativeJMH extends FibonacciJMH {

  @Param("268435456")
  int n;

  @Override
  protected RubyFibonacciIterative getFreshInstance() {
    return new RubyFibonacciIterative();
  }

  @Override
  public int getN() {
    return n;
  }
}