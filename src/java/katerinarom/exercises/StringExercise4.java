package katerinarom.exercises;
import java.util.Scanner;
import java.lang.String;

/** Remove from the text all words of a given length starting with a consonant*/

final class StringExercise4 {

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String text = "gghjklduiuduyvg  yuiif ghjklyui errty";
      String separator = " ";
      String[] splitWords = text.split(separator);
      System.out.println("Please enter k ");
      int k = scanner.nextInt();
      String insertString = "xxxxxx";
      StringBuilder result = new StringBuilder();
      for (int i = 0; i < splitWords.length; i++) {
        result.append(changeWord(splitWords[i], k, insertString)).append(separator);
      }
      System.out.println(result);
    }

    private static String changeWord(String word, int insertPosition, String insertString) {
      if (word.length() < insertPosition) {
        return word;
      }
      StringBuilder result = new StringBuilder(word.length() + insertString.length());
      return result.append(word).insert(insertPosition, insertString).toString();
    }
  }
