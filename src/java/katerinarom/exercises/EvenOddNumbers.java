package katerinarom.exercises;
import java.util.Scanner;
import java.lang.String;
/**
 *  Enter n integers from the console. Output to the console:
 *  Enter n integers from the console. Print even and odd numbers on the console
 */
final class EvenOddNumbers {

  public static void main(String[] args) {
    System.out.print("How many integers do you want to enter? ");
    Scanner scanner = new Scanner(System.in);
    int numbers = scanner.nextInt();
    int[] sort = new int[numbers];
    System.out.print("Please enter integers using a space" + " and press <Enter>: ");
    for (int i = 0; i < numbers; i++) {
      sort[i] = scanner.nextInt();
    }
    for (int i = 0; i < numbers; i++) {
      if (sort[i] % 2 != 0) {
        System.out.println("Odd:" + sort[i]);
      }
    }
  }
}
        /**} else if (sort[i] % 2 == 0)
        System.out.println("Even:" + sort[i]);
    }*/
