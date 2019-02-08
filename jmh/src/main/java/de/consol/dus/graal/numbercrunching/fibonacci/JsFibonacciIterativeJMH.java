package de.consol.dus.graal.numbercrunching.fibonacci;

import java.io.IOException;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Warmup;

@Warmup(iterations = 1)
@Measurement(iterations = 1)
public class JsFibonacciIterativeJMH extends FibonacciJMH {

  @Param("268435456")
  int n;

  @Override
  protected JsFibonacciIterative getFreshInstance() {
    try {
      return new JsFibonacciIterative();
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