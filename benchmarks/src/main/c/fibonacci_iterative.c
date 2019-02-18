#include <inttypes.h>
#include <stdio.h>
#include <stdlib.h>

uint64_t fibonacci(const int32_t n)
{
  if (1 >= n)
  {
    return n;
  }

  int64_t n_minus_two = 0;
  int64_t n_minus_one = 1;
  for (int32_t index = 2; index <= n; ++index)
  {
    n_minus_one += n_minus_two;
    n_minus_two = n_minus_one - n_minus_two;
//    if (0 == index % 1000000)
//    {
//      printf("%" PRId32 "\n", index);
//    }
  }
  return n_minus_one;
}

int main(int32_t argc, char** argv)
{
  if (2 > argc)
  {
    printf("please provide n as command line argument.");
    return 42;
  }

  uint32_t n;
  char c;
  sscanf(argv[1], "%" SCNu32 "%c", &n, &c);
  printf("%"PRId64"\n", fibonacci(n));
  return 0;
}
