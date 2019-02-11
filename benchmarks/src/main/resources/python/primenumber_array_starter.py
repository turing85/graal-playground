import sys
from primenumber_array import get_nth_prime

n = int(sys.argv[1])
prime = get_nth_prime(n)
print(prime)