//  do not allocate memory for the result
//  write to pre-allocated pointer *camel

void to_camel_case(const char *text, char *camel) {

  while (*text != '\0') {
    if (*text == '-' || *text == '_') {

      text++;

      if (*text >= 97 && *text <= 122) {
        *camel = *text - 32;
        text++;
        camel++;
      }

    } else {
      *camel = *text;
      text++;
      camel++;
    }
  }

  *camel = '\0';
}

