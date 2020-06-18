package katerinarom.exercises;
import java.util.Scanner;
import java.lang.String;

/** Remove from the text all words of a given length starting with a consonant*/

final class StringExercise3 {

  public static void main(String[] args) {
      String word = "gghjklduiuduyvg hjk yuio uiopl";
      String separator = " ";
      String[] splitWords = word.split(separator);
      StringBuilder result = new StringBuilder();
      for (int i = 0; i < splitWords.length; i++) {
        if (!startsWithConsonant(splitWords[i])) {
          result.append(splitWords[i]).append(separator);
        }
      }
      System.out.println(result);
    }

    private static boolean startsWithConsonant(String word) {
      char[] consonant = new char[] {'b', 'c', 'd', 'f', 'g', 'h', 'k'};
      for (int i = 0; i < consonant.length; i++) {
        char firstLetter = word.charAt(0);
        if (firstLetter == consonant[i]) {
          return true;
        }
      }
      return false;
    }
  }
