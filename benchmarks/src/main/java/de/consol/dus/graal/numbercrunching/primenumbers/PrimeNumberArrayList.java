package de.consol.dus.graal.numbercrunching.primenumbers;

import java.util.ArrayList;

public class PrimeNumberArrayList implements PrimeNumber {

  @SuppressWarnings("Duplicates")
  @Override
  public long getNthPrime(int n) {
    if (n == 1) {
      return 2L;
    }
    if (n == 2) {
      return 3L;
    }

    ArrayList<Long> primes = new ArrayList<>();
    primes.add(2L);
    primes.add(3L);

    int primeCounter = 2;
    long candidate = 5;
    while (primeCounter < n) {
      boolean isPrime = true;
      int divisorIndex = 0;
      while (isPrime) {
        long divisor = primes.get(divisorIndex);
        if (divisor * divisor > candidate) {
          break;
        }

        if (candidate % divisor == 0) {
          isPrime = false;
        }
        ++divisorIndex;
      }
      if (isPrime) {
        primes.add(candidate);
        ++primeCounter;
      }
      candidate += 2;
    }

    return primes.get(n -1);
  }
}
