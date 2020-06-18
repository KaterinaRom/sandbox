package katerinarom.exercises;
import java.util.Scanner;

/*Enter the n-dimension of the matrix a [n] [n] from the console. Set values of matrix elements in the range of values from -n to n using a random number sensor.
Convert matrix rows so that elements equal to zero are located after all the others.*/

  final class Elements0TheLast {

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
      for (int i = 0; i < array.length; i++) {
          moveZeroElementToRightInOneRow(array[i]);
      }
      System.out.println();
      printArray(array);
    }

    private static final void printArray(int[][] array) {
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
          System.out.print(array[i][j] + " ");
        }
        System.out.println();
      }
    }

    private static void moveZeroElementToRightInOneRow(int[] row) {
      for (int i = 0; i <  row.length - 1; i++) {
          if ( row[i] == 0) {
            int tmp =  row[i];
             row[i] =  row[i + 1];
             row[i + 1] = tmp;
          }
        }
      }
    }
