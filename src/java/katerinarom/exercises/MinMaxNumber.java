package katerinarom.exercises;
import java.util.Scanner;
import java.lang.String;
/**
 * Enter n integers from the console. On the console display the largest and smallest number.
 */
final class MinMaxNumber {

  public static void main(String[] args) {
    System.out.print("How many integers do you want to enter? ");
    Scanner scanner = new Scanner(System.in);
    int numbers = scanner.nextInt();
    int[] sort = new int[numbers];
    System.out.print("Please enter integers using a space" + " and press <Enter>: ");
    for (int i = 0; i < numbers; i++) {
      sort[i] = scanner.nextInt();
    }
    int min = sort[0];
    for (int i = 0; i < numbers; i++) {
      if (min > sort[i]) {
        min = sort[i];
      }
      System.out.println("MinNumber" + min);
    }
  }
}

  /**
  int max = sort[0];
 for (int i = 0; i < numbers; i++) {
 if (max < sort[i]) {
 max = sort[i];
 }
 System.out.println("MaxNumber" + max);
   */
