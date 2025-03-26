package kata

import (
  "strings"
)

func Disemvowel(comment string) string {
  for _, c := range []string{"a", "A", "e", "E", "i", "I", "o", "O", "u", "U"} {
		comment = strings.ReplaceAll(comment, c, "")
	}
   return comment
}