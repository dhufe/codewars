package kata

func Points(games []string) int {
  pts := 0
  // your code here!
  for _, v := range (games) {
    if v[0] > v[2] {
      pts += 3
    } else if v[0] < v[2] {
      pts += 0
    } else if v[0] == v[2] {
      pts += 1
    }
  }

  return pts
}