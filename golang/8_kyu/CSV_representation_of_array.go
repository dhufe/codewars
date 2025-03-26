package kata

import (
  "strconv"
)

func ToCsvText(array [][]int) string {
  var res string

      for q, k := range array {
        for p, y := range k {
          s := strconv.FormatInt(int64(y), 10)
          res += s
          if p < (len(k) - 1) {
            res += string(",")
          }
        }
        if q < (len(array) - 1) {
          res += "\n"
          }
      }
  return res
}