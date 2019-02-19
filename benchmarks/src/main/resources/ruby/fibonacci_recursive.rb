def fibonacci(n)
  if (n <= 1)
    return n
  end
  return fibonacci(n - 1) + fibonacci(n - 2)
end

if __FILE__ == $0
  n = ARGV[0].to_i
  puts(fibonacci(n))
end