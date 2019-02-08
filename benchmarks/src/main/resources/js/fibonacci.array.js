function fibonacci(n) {
  if (n <= 1) {
    return n;
  }

  let fibonacci = [];
  fibonacci.push(0)
  fibonacci.push(1)
  for (let index = 2; index <= n; ++index) {
    fibonacci.push(fibonacci[index - 1] + fibonacci[index - 2])
  }

  return fibonacci[fibonacci.length - 1]
}