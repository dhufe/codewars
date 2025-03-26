#include <stdbool.h>

bool xo(const char *str) {
  int cnt_o = 0;
  int cnt_x = 0;
  while (*str) {
    if (*str == 'o' || *str == 'O')
      cnt_o++;
    if (*str == 'x' || *str == 'X')
      cnt_x++;
    str++;
  }
  return cnt_o == cnt_x;
}
