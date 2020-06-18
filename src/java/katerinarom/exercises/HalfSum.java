package katerinarom.exercises;
import java.util.Scanner;
import java.lang.String;

/**
 * Enter n integers from the console. Output to the console:
 * Elements that are equal to the half-sum of neighboring elements
 */
final class HalfSum {

  public static void main(String[] args) {
    System.out.println("How many integers do you want to enter?");
    Scanner scanner = new Scanner(System.in);
    int numbers = scanner.nextInt();
    int[] sort = new int[numbers];
    System.out.println("Please enter integers using a space" + " and press <Enter>: ");
    for (int i = 0; i < numbers; i++) {
      sort[i] = scanner.nextInt();
    }
    //      for (int i = 1; i < sort.length - 1; i++) {
    //        if (sort[i] == ((sort[i - 1] + sort[i + 1]) / 2)) {
    //          System.out.println(sort[i - 1] + " " + sort[i + 1]);
    //        }
    //      }
    for (int i = 0; i < sort.length - 1; i++) {
        System.out.println((sort[i] + sort[i + 1]) / 2);
      }
    }
  }
