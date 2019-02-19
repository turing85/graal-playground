def fibonacci(n)
  if (n <= 1)
    return n
  end
  nMinusTwo = 0
  nMinusOne = 1
  for index in 2..n
    nMinusOne += nMinusTwo
    nMinusTwo = nMinusOne - nMinusTwo
  end
  return nMinusOne
end

if __FILE__ == $0
  n = ARGV[0].to_i
  puts(fibonacci(n))
end