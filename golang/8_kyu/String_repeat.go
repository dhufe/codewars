package kata

func RepeatStr(repetitions int, value string) string {
  var s string
  for i:=0; i < repetitions; i++ {
    s += value
  }
  return s
}