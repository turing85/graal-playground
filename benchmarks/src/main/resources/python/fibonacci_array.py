def fibonacci(n):
  if n <= 1:
    return n
  fibonacci = [0, 1]
  for index in range(2, n + 1):
    fibonacci.append(fibonacci[index - 1] + fibonacci[index - 2])

  return fibonacci[n]