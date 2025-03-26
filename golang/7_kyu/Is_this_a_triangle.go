package kata

import (
  "math"

)

func IsTriangle(a, b, c int) bool {
  // no negative sides
  if a <= 0 || b <= 0 || c <= 0 {
    return false
  }
  var s float64 = float64(a+b+c)/2.0

  // no negative perimeter
  if s <= 0 {
    return false
  }

  var F = math.Sqrt (s*(s-float64(a))*(s-float64(b))*(s-float64(c)))

  if F > 0.0 {
    return true
  }
  return false
}