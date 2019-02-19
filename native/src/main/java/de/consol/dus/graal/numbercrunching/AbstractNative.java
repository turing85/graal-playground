package de.consol.dus.graal.numbercrunching;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;

public abstract class AbstractNative {

  public static final int WARMUPS = 10;
  public static final int ITERATIONS = 10;
  public abstract void execute();

  public void benchmark() {
    System.out.println("WARMUP");
    ArrayList<Double> times = new ArrayList<>();
    for (int iteration = 0; iteration < WARMUPS; ++iteration) {
      long start = System.nanoTime();
      execute();
      long time = System.nanoTime() - start;
      double inSeconds = time / 1_000_000_000d;
      System.out.printf("Iteration %d: %f s/op%n", iteration + 1, inSeconds);
    }
    System.out.println("TEST");
    for (int iteration = 0; iteration < ITERATIONS; ++iteration) {
      long start = System.nanoTime();
      execute();
      long time = System.nanoTime() - start;
      double inSeconds = time / 1_000_000_000d;
      times.add(inSeconds);
      System.out.printf("Iteration %d: %f s/op%n", iteration + 1, inSeconds);
    }

    DoubleSummaryStatistics statistics = times.stream()
        .mapToDouble(Double::valueOf)
        .summaryStatistics();

    System.out.printf("Avg: %f%n", statistics.getAverage());
  }
}