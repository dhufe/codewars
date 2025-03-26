package kata

func Past(h, m, s int) int {
    // your code here
  return (s + m*60 + h * 3600 )*1000
}