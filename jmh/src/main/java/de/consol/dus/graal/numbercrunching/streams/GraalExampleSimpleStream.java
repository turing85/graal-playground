package de.consol.dus.graal.numbercrunching.streams;

import de.consol.dus.graal.AbstractBenchmark;
import java.util.stream.IntStream;
import org.openjdk.jmh.annotations.Param;

public class GraalExampleSimpleStream extends AbstractBenchmark {

  @Param("134217728")
  private int n = 0;

  @Override
  public void setup() {

  }

  @Override
  public void tearDown() {

  }

  @Override
  public void execute() {
    IntStream.range(0, n)
        .map(x -> x + 1)
        .map(x -> x * 2)
        .map(x -> x + 2)
        .reduce(0, Integer::sum);
  }
}