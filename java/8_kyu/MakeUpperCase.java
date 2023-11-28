class Upper{
  public static String MakeUpperCase(String str){
    //String result = str;
    char[] chars = str.toCharArray();
    
    for ( int idx = 0; idx < chars.length; ++idx ) {
      // only convert characters between 'a' (0x61) and 'z' (0x7A)
      if ( ( chars[idx] >= 0x61 ) && ( chars[idx] <= 0x7A) ){
          chars[idx] &= 0x5f;
        }
    }
    
    return String.valueOf(chars);
  }
}