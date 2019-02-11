package de.consol.dus.graal.numbercrunching.fibonacci;

import org.openjdk.jmh.annotations.Param;

public class JsFibonacciRecursiveJMH extends FibonacciJMH {

  @Param("40")
  int n;

  @Override
  protected JsFibonacciRecursive getFreshInstance() {
    return new JsFibonacciRecursive();
  }

  @Override
  public int getN() {
    return n;
  }
}