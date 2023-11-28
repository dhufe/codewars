public class Positive{

  public static int sum(int[] arr){    
    int iSum = 0;
    // loop over all numbers
    for ( int val : arr ) {
      // if positive sum up
      if ( val >= 0) {
        iSum += val;
      }
    }
    return iSum;
  }
}