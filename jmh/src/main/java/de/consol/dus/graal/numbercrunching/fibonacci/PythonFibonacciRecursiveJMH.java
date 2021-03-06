package de.consol.dus.graal.numbercrunching.fibonacci;

import org.openjdk.jmh.annotations.Param;

public class PythonFibonacciRecursiveJMH extends FibonacciJMH {

  @Param("40")
  int n;

  @Override
  protected PythonFibonacciRecursive getFreshInstance() {
    return new PythonFibonacciRecursive();
  }

  @Override
  public int getN() {
    return n;
  }
}