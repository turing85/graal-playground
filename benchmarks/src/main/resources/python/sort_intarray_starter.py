import sys
from random import randint
from sort_intarray import sort

def swap(a, i, j):
  tmp = a[i]
  a[i] = a[j]
  a[j] = tmp

def create_shuffled_array(n):
  array = []
  for index in range(0, n):
    array.append(index)

  for index in reversed(range(1, n)):
    swap_with = randint(0, index)
    swap(array, index, swap_with)

  return array

n = int(sys.argv[1])

arr = create_shuffled_array(n)
sort(arr)
print(str(arr))