package kata

func century(year int) int {
  var res int = 0
  res = int(year / 100)
  if year % 100 != 0 {
    res += 1
  }
  return res
}