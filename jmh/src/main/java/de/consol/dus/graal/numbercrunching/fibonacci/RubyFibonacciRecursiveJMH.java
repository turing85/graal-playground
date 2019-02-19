package de.consol.dus.graal.numbercrunching.fibonacci;

import org.openjdk.jmh.annotations.Param;

public class RubyFibonacciRecursiveJMH extends FibonacciJMH {

  @Param("40")
  int n;

  @Override
  protected RubyFibonacciRecursive getFreshInstance() {
    return new RubyFibonacciRecursive();
  }

  @Override
  public int getN() {
    return n;
  }
}