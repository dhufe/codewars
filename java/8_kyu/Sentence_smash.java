import java.util.Arrays;

public class SmashWords {

	public static String smash(String [] words) {
    // TODO Write your code below this comment please
    String result = "";
    
    // loop over array content (if any exist)
    for ( int i = 0; i < words.length; ++i ) {
      
      // if last silbling don't add a space character to the output
      if ( i == (words.length - 1)) {
        result += words[i];
      } else {
        result += words[i] + " ";
      }
    }
    
    return result;
  }
}