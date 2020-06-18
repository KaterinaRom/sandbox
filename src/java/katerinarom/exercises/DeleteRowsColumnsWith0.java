package katerinarom.exercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*Enter the n-dimension of the matrix a [n][n] from the console. Set values of matrix elements in the range of values from -n to n using a random number sensor.
Compact the matrix by deleting rows and columns filled with zeros from it.*/

final class DeleteRowsColumnsWith0 {

  public static void main(String[] args) {
    System.out.print("Please enter n to create a matrix a[n][n]: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] array = new int[n][n];
    for (int j = 0; j < n; j++) {//init array with random numbers in the interval [-n; n]
      for (int i = 0; i < n; i++) {
        array[i][j] = (int)(Math.random() * (2 * n - 1)) - n;
      }
    }
    printArray(array);
    System.out.println();
    int valueToRemove = maxValue(array);
    printArray(determining0Element(array, valueToRemove));
  }

  private static final void printArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }

  private static int[][] determining0Element(int[][] array, int valueToExclude) {
    Set<Integer> rowIdxes =
        new HashSet<>(); //we use set, since only unique values are stored there
    Set<Integer> columnIdxes = new HashSet<>();
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (array[i][j] == valueToExclude) {
          rowIdxes.add(i);
          columnIdxes.add(j);
        }
      }
    }
    int x = array.length - rowIdxes.size();
    int y = array.length - columnIdxes.size();
    int[][] newA = new int[x][y];
    for (int i = 0; i < array.length - 1; i++) {
      if (rowIdxes.contains(i)) {
        continue;
      }
      for (int j = 0; j < array.length - 1; j++) {
        if (columnIdxes.contains(j)) {
          continue;
        }
        newA[i][j] = array[i][j];
      }
    }
    return newA;
  }

  private static int maxValue(int[][] a) {
    int max = a[0][0];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        if (a[i][j] > max) {
          max = a[i][j];
        }
      }
    }
    return max;
  }
}
