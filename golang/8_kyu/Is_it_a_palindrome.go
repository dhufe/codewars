package kata

import "strings"

func IsPalindrome(str string) bool {
  var result string

  for _, v := range strings.ToLower(str) {
        result = string(v) + result
  }

  return strings.ToLower(str) == result
}