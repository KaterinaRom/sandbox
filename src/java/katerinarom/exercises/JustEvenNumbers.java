package katerinarom.exercises;
import java.util.Scanner;

/**Enter n integers from the console. Find qty of numbers containing only even digits.
*/

final class JustEvenNumbers {

  public static void main(String[] args) {
    System.out.println("How many integers do you want to enter?");
    Scanner scanner = new Scanner(System.in);
    int numberCount = scanner.nextInt();
    int result = 0;
    System.out.println("Please enter integers using a space" + " and press <Enter>: ");
    for (int i = 0; i < numberCount; i++) {
      if (hasEvenDigit(scanner.next())) {
        result++;
      }
    }
        System.out.printf("There are %s numbers that contain at least one even digit%n", result);
      }

      private static boolean hasEvenDigit(final String numberStringRepresentation) {
        char[] digits = numberStringRepresentation.toCharArray();
        for (char digit : digits) {
          if (isEvenDigit(digit)) {
            return true;
          }
        }
        return false;
      }

      private static boolean isEvenDigit(char digit) {
        return (digit == '0' || digit == '2' || digit == '4' || digit == '6' || digit == '8');
      }

      private JustEvenNumbers() {
        throw new UnsupportedOperationException("This class is not supposed to be instantiated");
      }
    }
