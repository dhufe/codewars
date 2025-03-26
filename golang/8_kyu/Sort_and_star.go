package kata

import (
  "fmt"
  "sort"
)

func TwoSort(arr []string) string {

  sort.Strings(arr)
  fmt.Printf( "string %s, idx %d, char %c", arr[0], 0 , arr[0][0])

  var result string = ""

  for p, c := range arr[0] {
    if (p >= (len(arr[0]) - 1) ) {
      result += string(c)
      } else  {
      result += string(c) + "***"
      }
  }

  return result
}