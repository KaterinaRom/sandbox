package katerinarom.exercises;
import java.util.Scanner;
import java.lang.String;

/**
 * Rotate the matrix 90 (180, 270) degrees counterclockwise.
 */
final class RotatingOfMatrix {

  public static void main(String[] args) {
    System.out.print("Please enter n to create a matrix a[n][n]: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] array = new int[n][n];
    for (int j = 0; j < n; j++) {
      for (int i = 0; i < n; i++) {
        array[i][j] = (int)(Math.random() * (2 * n - 1)) - n;
      }
    }
    printArray(array);
    int[][] temp = rotate270(array);
    System.out.println();
    printArray(temp);
  }

  private static final void printArray(int[][] array) {
    for (int j = 0; j < array.length; j++) {
      for (int i = 0; i < array.length; i++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }

  private static int[][] rotate270(int[][] a) {
    int[][] b = new int[a.length][a.length];
    for (int j = 0; j < b.length; j++) {
      for (int i = 0; i < b.length; i++) {
        b[j][b.length - i - 1] = a[i][j]; // 90 counterclockwise
//         rotate180 clockwise and counterclockwise
//      b[b.length - i - 1][b.length - j - 1] = a[i][j];
//          rotate 90 clockwise
//        b[b.length - j - 1][i] = a[i][j];
      }
    }
    return b;
  }
}
