package de.consol.dus.graal.sorting;

import de.consol.dus.graal.AbstractBenchmark;

public abstract class SortJMH extends AbstractBenchmark {

  @Override
  public abstract void setup();

  @Override
  public abstract void tearDown();

  public abstract void sort();

  @Override
  public final void execute() {
    sort();
  }
}