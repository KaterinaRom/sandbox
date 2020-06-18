package katerinarom.exercises;
import java.util.Scanner;
import java.lang.Math;
import java.util.concurrent.ThreadLocalRandom;

/**Set the values of the matrix elements in the range of values from -n to n using Math.random. Transpose the square matrix.
*/
final class ReversingOfMatrix {

  public static void main(String[] args) {
   System.out.print("Please enter n to create a matrix a[n][n]: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] array = new int[n][n];
    for (int j = 0; j < n; j++) {
      for (int i = 0; i < n; i++) {
        array[i][j] = ThreadLocalRandom.current().nextInt(-n, n + 1);//[-n; n+1) = [-n; n]
      }
    }
    printArray(array);
    transpose(array);
    System.out.println();
    printArray(array);
  }

  private static final void printArray(int[][] array) {
    for (int lineIdx = 0; lineIdx < array.length; lineIdx++) { //row idx
    for (int lineElementIdx = 0; lineElementIdx < array.length; lineElementIdx++) { // element in the row/ idx
        System.out.print(array[lineIdx][lineElementIdx] + " ");
      }
      System.out.println();
    }
  }

  private static void transpose(int[][] array) {
    for (int lineIdx = 0; lineIdx < array.length; lineIdx++) {
      for (int lineElementIdx = lineIdx - 1; lineElementIdx > 0; lineElementIdx--) { //because i > j  we are considering the top part of the matrix or for (int lineElementIdx = lineIdx + 1; lineElementIdx < array.length; lineElementIdx++)
        int temp = array[lineIdx][lineElementIdx];
        array[lineIdx][lineElementIdx] = array[lineElementIdx][lineIdx];
        array[lineElementIdx][lineIdx] = temp;
      }
    }
  }
}
