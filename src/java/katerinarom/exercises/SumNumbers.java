package katerinarom.exercises;

import java.util.Scanner;

/**
 * Enter integers as command line arguments, calculate their sums (composition) and print the result to the console.
 */
final class SumNumbers {

  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter integers ");
    int value = scanner.nextInt();
    int sum = 0;
   /** while (value != 0) {
      sum = sum + value % 10;
      value = value / 10;
    }
    System.out.println("The sum of the integers is " + sum);
  }
}
    **/

 int com = 1;
 while (value != 0) {
 com = com * (value % 10);
 value = value / 10;
 }
 System.out.println("The composition of the integers is " + com);
  }
}
