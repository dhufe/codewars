package kata

import (
    "unicode"
)

func ToAlternatingCase(str string) string {
  res := []byte(str)
  for pos, char := range str {
    if ( unicode.IsLower(char) ) {
      res[pos] = byte(unicode.ToUpper(char))
    } else if (unicode.IsUpper(char) ) {
      res[pos] = byte(unicode.ToLower(char))
    }
  }
  return string(res)
}