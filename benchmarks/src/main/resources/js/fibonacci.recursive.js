function fibonacci(n) {
  if (n <= 1) {
    return n
  }

  let nMinusOne = fibonacci(n - 1)
  let nMinusTwo = fibonacci(n - 2)

  return nMinusOne + nMinusTwo;
}