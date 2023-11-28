public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    // Your code here
    int average = 0;
    int sum = 0;
    
    // claculate mean of the array
    for ( int point : classPoints ){
       sum += point;
    }
    average = sum / classPoints.length;
    
    // return if I am better or not
    return (yourPoints > average ? true : false );
  }
}