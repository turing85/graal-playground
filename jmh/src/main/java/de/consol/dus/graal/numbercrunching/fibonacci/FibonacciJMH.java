package de.consol.dus.graal.numbercrunching.fibonacci;

import de.consol.dus.graal.AbstractBenchmark;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.annotations.Warmup;

public abstract class FibonacciJMH extends AbstractBenchmark {

  private Fibonacci fibonacci;

  @Override
  public final void setup() {
    fibonacci = getFreshInstance();
  }

  @Override
  public void tearDown() {
    fibonacci = null;
  }

  abstract protected Fibonacci getFreshInstance();

  public abstract int getNth();

  public final Fibonacci getFibonacci() {
    return fibonacci;
  }

  @Override
  public final void execute() {
    getFibonacci().calculateNthFibonacci(getNth());
  }
}