import sys
from fibonacci_recursive import fibonacci

n = int(sys.argv[1])
fib = fibonacci(n)
print(fib)