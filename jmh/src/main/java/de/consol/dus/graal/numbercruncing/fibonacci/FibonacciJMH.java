package de.consol.dus.graal.numbercruncing.fibonacci;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

@BenchmarkMode(Mode.SingleShotTime)
@Warmup(iterations = 10)
@Measurement(iterations = 10)
@Fork(1)
@State(Scope.Benchmark)
public abstract class FibonacciJMH {

  private Fibonacci fibonacci;

  FibonacciJMH() {
    init();
  }

  abstract protected void init();

  public Fibonacci getFibonacci() {
    return fibonacci;
  }

  public abstract int getN();

  public void setFibonacci(Fibonacci fibonacci) {
    this.fibonacci = fibonacci;
  }

  @Benchmark
  public final void execute() {
    getFibonacci().calculateNthFibonacci(getN());
  }
}