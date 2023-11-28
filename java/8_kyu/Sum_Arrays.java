public class SumArray {

  public static double sum(double[] numbers) {
    double sum = 0.0;
    
    for ( double val : numbers ) {
      sum += val;
    }
    
    return sum;
  }
}