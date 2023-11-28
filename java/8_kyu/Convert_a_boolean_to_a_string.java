public class BooleanToString {
  public static String convert(boolean b) {
    if ( b ) {
      return new String("true");
    } else {
      return new String("false");
    }
  }
}