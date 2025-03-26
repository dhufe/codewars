#include <stddef.h>
#include <stdio.h>

//  assign divisors to array[]
//  set *length to the number of divisors

void divisors(unsigned n, size_t *length, unsigned array[]) {
  // reset current length ;)
  *length = 0;
  unsigned idx;

  for (unsigned idx = 2; idx < n; ++idx) {
    if (n % idx == 0) {
      array[(*length)] = idx;
      (*length)++;
    }
  }
}
