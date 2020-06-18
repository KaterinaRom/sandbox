package katerinarom.exercises;
import java.util.Scanner;

/**
 * Print numbers from 1 to k in the form of a matrix N x N from left to right and from top to bottom.
 */

final class MatrixNxN {

  public static void main(String[] args) {
    System.out.print("Please enter the number k and n:");
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    int n = scanner.nextInt();
    if (k > n * n) {
      throw new IllegalArgumentException("k is too large");
    }
    for (int j = 0; j <= n - 1; j++) {
      for (int i = 1; i <= n; i++) {
        int value = j * n + i;
        if (value > k) {
          break;
        }
        System.out.print(value + " ");
      }
      System.out.println();
    }
  }
}


  /**Scanner scan = new Scanner(System.in);
  System.out.println("Enter array length: ");
  int size = scan.nextInt();
  int array[][] = new int[size][size];
  System.out.println("Insert array elements:");
  for (int i = 0; i < array.length; i++) {
    for (int j = 0; j < array[i].length; j++) {
    array[i][j] = scan.nextInt();
    }
    }
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j]);
      }
      System.out.println();
    }
  }
}
*/
