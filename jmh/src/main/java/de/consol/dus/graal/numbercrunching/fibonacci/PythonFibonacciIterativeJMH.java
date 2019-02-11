package de.consol.dus.graal.numbercrunching.fibonacci;

import org.openjdk.jmh.annotations.Param;

public class PythonFibonacciIterativeJMH extends FibonacciJMH {

  @Param("268435456")
  int n;

  @Override
  protected PythonFibonacciIterative getFreshInstance() {
    return new PythonFibonacciIterative();
  }

  @Override
  public int getN() {
    return n;
  }
}