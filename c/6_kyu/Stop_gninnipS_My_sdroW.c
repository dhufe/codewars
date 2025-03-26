//  do not allocate memory for return string
//  assign the value to the pointer "result"

#include <stdio.h>
#include <string.h>

void spin_words(const char *sentence, char *result) {
  char buff[512];
  strcpy(buff, sentence);
  char *token = strtok(buff, " ");

  while (token) {
    if (strlen(token) >= 5) {
      for (int i = strlen(token) - 1; i >= 0; i--) {
        *result = token[i];
        result++;
      }
    } else {

      for (int i = 0; i < strlen(token); i++) {
        *result = token[i];
        result++;
      }
    }

    // printf( "Token: %s\n", token);
    token = strtok(NULL, " ");
    if (token) {
      *result = ' ';
      result++;
    }
  }
  *result = '\0';
}
