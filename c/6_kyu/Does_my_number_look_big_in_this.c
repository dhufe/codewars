#include <stdbool.h>
#include <string.h>
#include <stdio.h>

bool narcissistic(int num)
{
  char s[20];
  char* ptr = s;
  sprintf(s,"%d", num);
  unsigned int slen = strlen(s);
  int sum = 0;
  unsigned int index;
  while ( *ptr != '\0') {
    unsigned long tmp = 1;
    for ( index = 0; index < slen; index++) {
      tmp *= ((int)(*ptr) - 48);
    }
    sum += tmp;
    ptr++;
  }
  return sum == num;
}