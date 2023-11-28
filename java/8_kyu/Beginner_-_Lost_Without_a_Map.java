public class Maps {
  public static int[] map(int[] arr) {
    
    int [] result = new int [ arr.length];
    
    for ( int idx = 0; idx < arr.length; ++idx ) {
      result[idx] = 2 * arr[idx];
    }
    
    return result;
  }
}