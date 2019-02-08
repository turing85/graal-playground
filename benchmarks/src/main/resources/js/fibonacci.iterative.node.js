let n = process.argv.slice(2)[0]
console.log(fibonacci(n))

function fibonacci(n) {
  if (n <= 1) {
    return n;
  }

  let nMinusOne = parseInt(1);
  let nMinusTwo = parseInt("0");
  for (let index = 2; index <= n; ++index) {
    nMinusOne += nMinusTwo;
    nMinusTwo = nMinusOne - nMinusTwo;
  }

  return nMinusOne;
}