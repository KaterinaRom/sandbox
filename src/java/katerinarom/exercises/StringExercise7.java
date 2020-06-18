package katerinarom.exercises;
import java.util.Scanner;
import java.lang.String;

/* Replace every 3rd character in the word with the sign - */
final class StringExercise7 {

  public static void main(String[] args) {
      String text = "Each Java source file contains a single public class or interface";
      String[] splitString = text.split(" ");
      String newString = "";

      for (int i = 0; i < splitString.length; i++) {
        if (splitString[i].length() >= 3) {
          StringBuilder sb = new StringBuilder(splitString[i]);
          sb.setCharAt(2, '-');
          newString += sb.toString().concat(" ");
        }
      }
      System.out.println(newString);
    }
  }
