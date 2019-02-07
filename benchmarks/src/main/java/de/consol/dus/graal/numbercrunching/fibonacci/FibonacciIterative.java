package de.consol.dus.graal.numbercrunching.fibonacci;

public class FibonacciIterative implements Fibonacci {

  public final long calculateNthFibonacci(int n) {
    if (n <= 1) {
      return n;
    }

    long nMinusTwo = 0;
    long nMinusOne = 1;

    for (int current = 2; current <= n; ++current) {
      nMinusOne += nMinusTwo;
      nMinusTwo = nMinusOne - nMinusTwo;
    }

    return nMinusOne;
  }
}