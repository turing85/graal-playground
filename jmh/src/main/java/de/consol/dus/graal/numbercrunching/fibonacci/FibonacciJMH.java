package de.consol.dus.graal.numbercrunching.fibonacci;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.annotations.Warmup;

@BenchmarkMode(Mode.SingleShotTime)
@Warmup(iterations = 10)
@Measurement(iterations = 10)
@Fork(1)
@State(Scope.Benchmark)
public abstract class FibonacciJMH {

  private Fibonacci fibonacci;

  @Setup(Level.Iteration)
  public final void setup() {
    fibonacci = getFreshInstance();
  }

  @TearDown(Level.Iteration)
  public void tearDown() {
    fibonacci = null;
  }

  abstract protected Fibonacci getFreshInstance();

  public abstract int getN();

  public final Fibonacci getFibonacci() {
    return fibonacci;
  }

  @Benchmark
  public final void execute() {
    getFibonacci().calculateNthFibonacci(getN());
  }
}