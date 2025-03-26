package kata

func SquareSum(numbers []int) int {
    var res = 0
    for _, v := range (numbers) {
      res += v*v
    }
  return res
}