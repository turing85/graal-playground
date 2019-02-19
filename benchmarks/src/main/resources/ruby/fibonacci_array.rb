def fibonacci(n)
  if (n <= 1)
    return n
  end
  fibonacci = Array.new
  fibonacci << 0 << 1
  for index in 2..n
    fibonacci << fibonacci[index - 1] + fibonacci[index - 2]
  end
  return fibonacci[n]
end

if __FILE__ == $0
  n = ARGV[0].to_i
  puts(fibonacci(n))
end