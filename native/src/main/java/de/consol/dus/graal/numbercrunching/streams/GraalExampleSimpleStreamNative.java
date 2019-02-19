package de.consol.dus.graal.numbercrunching.streams;

import de.consol.dus.graal.numbercrunching.AbstractNative;
import java.util.stream.IntStream;

public class GraalExampleSimpleStreamNative extends AbstractNative {

  public static final int N = 134_217_728;

  public void execute() {
    IntStream.range(0, N)
        .map(x -> x + 1)
        .map(x -> x * 2)
        .map(x -> x + 2)
        .reduce(0, Integer::sum);
  }

  public static void main(String[] args) {
    new GraalExampleSimpleStreamNative().benchmark();
  }
}