package katerinarom.exercises;

import java.util.Scanner;

final class ShortLongNumber {

  public static void main(String[] args) {
    System.out.print("How many numbers do yo want to enter?: ");
    Scanner scan = new Scanner(System.in);
    final int count = scan.nextInt();
    String result = null;
    System.out.print("Enter numbers separated with Enter: ");
    for (int i = 0; i < count; i++) {
      String a = scan.next();
      if (result == null) {
        result = a;
      } else if (a.length() < result.length()) {
        result = a;
      }
    }
    System.out.println(result);
  }
}
