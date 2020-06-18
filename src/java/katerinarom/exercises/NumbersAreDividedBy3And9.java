package katerinarom.exercises;
import java.util.Scanner;
import java.lang.String;

/**
 * Enter n integers from the console. On the console, display the numbers, which are divided by 3 or 9.
 */
final class NumbersAreDividedBy3And9 {

  public static void main (String[] args) {
   System.out.println("How many integers do you want to enter?");
   Scanner scanner = new Scanner (System.in);
   int numbers = scanner.nextInt();
   int [] sort = new int [numbers];
   System.out.println("Please enter integers using a space" + " and press <Enter>: ");
   for (int i = 0; i < numbers; i ++) {
     sort[i] =  scanner.nextInt();
   }
   for (int i = 0; i < numbers; i++) {
       if ((sort[i] % 3 == 0) || (sort[i] % 9 == 0))
         System.out.println("The integers are divided by  3 or 9 " + sort[i]);
   }
  }

}
