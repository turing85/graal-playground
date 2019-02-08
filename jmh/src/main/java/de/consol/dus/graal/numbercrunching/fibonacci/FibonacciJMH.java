package de.consol.dus.graal.numbercrunching.fibonacci;

import de.consol.dus.graal.AbstractBenchmark;

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