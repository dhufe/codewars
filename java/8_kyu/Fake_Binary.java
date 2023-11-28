public class FakeBinary {
    public static String fakeBin(String numberString) {      
      
      char[] chars = numberString.toCharArray();
      int iDx = 0;
      
      for ( int idx = 0; idx < numberString.length(); ++idx) {
        if ( chars[idx] < 0x35) {
          chars[idx] = 0x30;
        } else {
          chars[idx] = 0x31;
        }
        
      }
      return String.valueOf(chars);
    }
}