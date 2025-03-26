package kata

func Xor(a bool, b bool) bool {
  // your code here:
  return (a || b) && !(a && b)
}