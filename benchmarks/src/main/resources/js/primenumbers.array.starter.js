for (let run = 1; run <= 10; ++run) {
  console.time('primenumber')
  getNthPrime(500000)
  console.timeEnd('primenumber')
}

function getNthPrime(n) {
  if (n === 1) {
    return 2
  }
  if (n === 2) {
    return 3
  }

  let primes = []
  primes.push(2)
  primes.push(3)

  let primeCounter = 2
  let candidate = 5;
  while (primeCounter < n) {
    let isPrime = true
    let dividerIndex = 0
    while (isPrime) {
      let divider = primes[dividerIndex]
      if (divider * divider > candidate) {
        break;
      }

      if (candidate % divider === 0) {
        isPrime = false
      }
      dividerIndex++
    }
    if (isPrime) {
      primes.push(candidate)
      ++primeCounter
    }
    candidate += 2
  }
  return primes[primes.length - 1]
}