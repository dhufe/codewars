package kata

func Grow(arr []int) int{
  var res int = 1
  for _, v := range arr {
     res *= v
  }

  return res
}