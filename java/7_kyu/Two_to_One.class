import java.util.Arrays;

public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        // your code
        String str = s1 + s2;
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        sb.append(chars[0]);
        for (int i = 1; i < chars.length; i++) {
          if (chars[i] != chars[i - 1]) {
              sb.append(chars[i]);
          }
        }
      return sb.toString();
      }
}