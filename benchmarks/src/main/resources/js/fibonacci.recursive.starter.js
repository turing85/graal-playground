let times = []
for (let run = 1; run <= 10; ++run) {
  console.time('fibonacci')
  fibonacci(40)
  times.push(console.timeEnd('fibonacci'))
}
console.log(times)

function fibonacci(n) {
  if (n <= 1) {
    return n
  }

  let nMinusOne = fibonacci(n - 1)
  let nMinusTwo = fibonacci(n - 2)

  return nMinusOne + nMinusTwo;
}