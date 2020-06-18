package katerinarom.exercises;

import java.util.Scanner;
import java.lang.Math;


/** Enter the n-dimension of the matrix a[n][n] from the console. Sort rows (columns) of the matrix in ascending order of values
 * elements of the k-th column (row).
 */
final class MatrixSortingByColumn {

  public static void main(String[] args) {
    System.out.print("Please enter n to create a matrix a[n][n]: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] array = new int[n][n];
    System.out.print("Please enter k: ");
    int k = scanner.nextInt();
    if (k < 0 || k >= array.length) {
      throw new IllegalArgumentException();
    }
    for (int j = 0; j < n; j++) {//init array with random numbers in the interval [-n; n]
      for (int i = 0; i < n; i++) {
        array[i][j] = (int)(Math.random() * (2 * n - 1)) - n;
      }
    }
    printArray(array);
    sortArrayAccordingToColumn(array, k);//the link from the array will be assigned to the box in the sortArrayAccordingToColumn method (since this is the first formal of the parameter) - this is the process of passing the parameter.
    System.out.println();
    printArray(array);
  }

  private static void sortArrayAccordingToColumn(int[][] a, int columnIdx) {
    boolean swaps;//true if swapped elements at least once, false otherwise
    do {
      swaps = false;
      for (int idx = 0; idx < a.length - 1; idx++) {
        if (a[idx][columnIdx] > a[idx + 1][columnIdx]) {//if elements are out of order, then swap them to introduce the required order
          swapRows(a, idx, idx + 1);
          swaps = true;
        }
      }
    } while (swaps);
  }

  private static void swapRows(int[][] a, int rowIndex1, int rowIndex2) {
    int[] tmp = a[rowIndex1];
    a[rowIndex1] = a[rowIndex2];
    a[rowIndex2] = tmp;
  }

  private static final void printArray (int[][] array){
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
          System.out.print(array[i][j] + " ");
        }
        System.out.println();
      }
    }
}
