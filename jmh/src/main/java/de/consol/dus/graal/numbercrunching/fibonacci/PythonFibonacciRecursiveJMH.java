package de.consol.dus.graal.numbercrunching.fibonacci;

import java.io.IOException;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Warmup;

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