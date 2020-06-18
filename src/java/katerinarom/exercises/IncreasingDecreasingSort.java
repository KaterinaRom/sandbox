package katerinarom.exercises;
import java.util.Scanner;

final class IncreasingDecreasingSort {

  public static void main(String[] args) {
    System.out.print("How many integers do you want to enter? ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int[] array = new int[number];
    System.out.print("Please enter integers using a space" + " and press <Enter>: ");
    for (int i = 0; i < number; i++) {
      array[i] = scanner.nextInt();
    }

    sort(array);

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  private final static void sort(int[] array) {
    int minIndex;
    int sort;
    for (int i = 0; i < array.length; i++) {
      minIndex = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }
      sort = array[i];
      array[i] = array[minIndex];
      array[minIndex] = sort;
    }
  }
}
