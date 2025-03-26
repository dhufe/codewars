#include <stdint.h>

char *create_phone_number(char phnum[15], const uint8_t digits[10]) {
  int idx = 0;
  char *ptr = &phnum[0];
  for (int i = 0; i < 14; i++) {
    switch (i) {
    case 0:
      *ptr = '(';
      break;
    case 4:
      *ptr = ')';
      break;
    case 5:
      *ptr = ' ';
      break;
    case 9:
      *ptr = '-';
      break;
    default:
      *ptr = 0x30 + digits[idx];
      idx++;
    }
    ptr++;
  }
  *ptr = '\0';
  return phnum;
}
