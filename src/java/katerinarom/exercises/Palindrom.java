package katerinarom.exercises;
import java.util.Scanner;

/** Enter n integers from the console. Output to the console: Palindrome numbers whose values in the direct and reverse order coincide.*/

  final class Palindrom {

    public static void main(String[] args) {
      System.out.println("How many integers do you want to enter?");
      Scanner scanner = new Scanner(System.in);
      int value = scanner.nextInt();
      System.out.println("Please enter integers using a space" + " and press <Enter>: ");
      for (int i = 0; i < value; i++) {
        int reverse = scanner.nextInt();
        if (isPalindrom(reverse)) {
          System.out.printf("The number %s is a palindrom%n", reverse);
        } else {
          System.out.printf("The number %s is not a palindrom%n", reverse);
        }
      }
    }

    private static boolean isPalindrom(final int v) {
//      char[] digits = String.valueOf(v).toCharArray();
//      for (int i = 0, j = digits.length - 1; i < digits.length; i++, j--) {
//        if (digits[i] == digits[j]) {
//          return true;
//        }
//        if (digits[i] > digits[j] || digits[j] > digits[i]) {
//          break;
//        }
//      }
//      return false;


      char[] digits = String.valueOf(v).toCharArray();
      for (int i = 0, j = digits.length - 1; i <= j; i++, j--) {
        if (digits[i] != digits[j]) {
          return false;
        }
      }
      return true;
    }
  }
