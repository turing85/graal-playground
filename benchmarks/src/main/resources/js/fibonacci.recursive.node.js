let n = process.argv.slice(2)[0]
console.log(fibonacci(n))

function fibonacci(n) {
  if (n <= 1) {
    return n
  }

  let nMinusOne = fibonacci(n - 1)
  let nMinusTwo = fibonacci(n - 2)

  return nMinusOne + nMinusTwo;
}