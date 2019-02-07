package de.consol.dus.graal.numbercrunching.primenumbers;

public class PrimeNumberArray implements PrimeNumber {

  @Override
  public long getNthPrime(int n) {
    if (n == 1) {
      return 2L;
    }
    if (n == 2) {
      return 3L;
    }

    long[] primes = new long[n];
    primes[0] = 2;
    primes[1] = 3;

    int primeCounter = 2;
    long candidate = 5;
    while (primeCounter < n) {
      boolean isPrime = true;
      int divisorIndex = 0;
      while (isPrime) {
        long divisor = primes[divisorIndex];
        if (divisor * divisor > candidate) {
          break;
        }

        if (candidate % divisor == 0) {
          isPrime = false;
        }
        ++divisorIndex;
      }
      if (isPrime) {
        primes[primeCounter] = candidate;
        ++primeCounter;
      }
      candidate += 2;
    }

    return primes[n -1];
  }
}
