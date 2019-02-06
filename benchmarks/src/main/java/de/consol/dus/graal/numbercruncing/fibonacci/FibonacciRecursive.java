package de.consol.dus.graal.numbercruncing.fibonacci;

public class FibonacciRecursive implements Fibonacci {

  @Override
  public long calculateNthFibonacci(int n) {
    if ((n == 0) || (n == 1)) {
      return n;
    }

    return calculateNthFibonacci(n - 1) + calculateNthFibonacci(n - 2);
  }
}