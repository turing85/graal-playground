package de.consol.dus.graal.numbercruncing.fibonacci;

import java.util.ArrayList;

public class FibonacciArrayList implements Fibonacci {

  @Override
  public long calculateNthFibonacci(int n) {
    if (n <= 1) {
      return n;
    }

    ArrayList<Long> sequence = new ArrayList<>(n);

    sequence.add(0L);
    sequence.add(1L);

    for (int index = 2; index <=n; ++index) {
      long nthFibonacci = sequence.get(index - 1)  + sequence.get(index - 2);
      sequence.add(nthFibonacci);
    }

    return sequence.get(n);
  }
}