public class Kata {
  
  public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
    // Your code here!
    return (distanceToPump / mpg <= fuelLeft) ? true : false;
  }
  
}