package de.consol.dus.graal.numbercrunching.fibonacci;

import java.io.IOException;
import org.openjdk.jmh.annotations.Param;

public class JsFibonacciRecursiveJMH extends FibonacciJMH {

  @Param("40")
  int n;

  @Override
  protected JsFibonacciIRecursive getFreshInstance() {
    try {
      return new JsFibonacciIRecursive();
    } catch (IOException e) {
      e.printStackTrace(System.err);
      return null;
    }
  }

  @Override
  public int getN() {
    return n;
  }
}