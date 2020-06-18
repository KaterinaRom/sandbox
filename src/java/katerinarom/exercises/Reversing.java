package katerinarom.exercises;
import java.util.Scanner;

/**
 * Display command line arguments in the reverse order in the console window.
 */
final class Reversing {

  public static void main(String[] args) {
    System.out.print("Please enter a sequence of numbers: ");
    Scanner scan = new Scanner(System.in);
    int value = scan.nextInt();
    int reverseValue = 0;
    do {
      reverseValue = reverseValue * 10 +(value % 10);
      value = value / 10;
    }
    while (value > 0);
    System.out.println("The reverse sequence of numbers" + reverseValue);
    scan.close();
  }
}
