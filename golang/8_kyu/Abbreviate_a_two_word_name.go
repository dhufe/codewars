package kata

import (
	"strings"
)

func AbbrevName(name string) string{
  //your code here
  strs := strings.Split( strings.ToUpper(name) , " ")
  return string(strs[0][0]) + string(".") + string(strs[1][0])
}