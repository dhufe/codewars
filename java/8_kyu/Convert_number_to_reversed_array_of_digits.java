import java.lang.String;
import java.util.Arrays;


public class Kata {
  public static int[] digitize(long n) {
    // Code here
    long nTmp = n;
    int nDigits = 0;
    
    // if input is zero return immediatley
    if ( n == 0) {
      return new int[1];
    }
    
    // if not zero get the number of digits
    while ( nTmp > 0) {
      nDigits++;
      nTmp = nTmp / 10;
    }
    
    // preallocate a new array with the correponding size
    int [] iArray = new int [nDigits];
    
    
    // fill the array
    nTmp = n;
    int iDx = 0;
    while ( nTmp > 0 ) {
      iArray [ iDx ] = (int) (nTmp % 10);
      nTmp = nTmp / 10;
      iDx++;
    }
    
    
    return iArray;
  }
}