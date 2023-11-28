public class Solution {

  public static boolean validatePin(String pin) {
    // check for 4 or 6 digits
    return pin.matches("[0-9]{4}") || pin.matches("[0-9]{6}");
  }

}