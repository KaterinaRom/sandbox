package katerinarom.exercises;
import java.util.Scanner;
import java.lang.String;


final class DifferentNumbers {

  public static void main(final String[] args) {
    System.out.println("How many integers do you want to enter?");
    final Scanner scanner = new Scanner(System.in);
    final int numberCount = scanner.nextInt(); //numbers qty
    System.out.println("Please enter integers using a space" + " and press <Enter>: ");
    for (int i = 0; i < numberCount; i++) { //number's idx
      int v = scanner.nextInt();
      if (uniqueDigits(v)) {
        System.out.printf("%s has only unique digits%n", v);
      } else {
        System.out.printf("%s has repeating digits%n", v);
      }
    }
  }

  private static boolean uniqueDigits(final int v) {
    final char[] digits = String.valueOf(v).toCharArray();
      for (int n = 0; n < digits.length; n++) { //n - idx char array element digit
        for (int j = n + 1; j < digits.length; j++) {
          if (digits[n] == digits[j]) {
            return false;
          }
        }
      }
      return true;
    }
  }
