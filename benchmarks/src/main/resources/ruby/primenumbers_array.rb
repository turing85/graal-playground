def get_nth_prime(n)
  if n == 1
    return 2
  elsif n == 2
    return 3
  end

  primes = [2, 3]
  index = 2
  candidate = 5
  while index < n
    is_prime = true
    for prime in primes
      if prime * prime > candidate
        break
      elsif candidate % prime == 0
        is_prime = false
      end
    end
    if is_prime == true
      primes << candidate
      index = index + 1
    end
    candidate += 2
  end
  return primes[n - 1]
end

if __FILE__ == $0
  n = ARGV[0].to_i
  puts(get_nth_prime(n))
end