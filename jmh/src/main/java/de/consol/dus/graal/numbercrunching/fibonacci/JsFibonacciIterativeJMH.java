package de.consol.dus.graal.numbercrunching.fibonacci;

import org.openjdk.jmh.annotations.Param;

public class JsFibonacciIterativeJMH extends FibonacciJMH {

  @Param("268435456")
  int n;

  @Override
  protected JsFibonacciIterative getFreshInstance() {
    return new JsFibonacciIterative();
  }

  @Override
  public int getN() {
    return n;
  }
}