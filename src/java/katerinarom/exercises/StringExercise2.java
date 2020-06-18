package katerinarom.exercises;
import java.util.Scanner;
import java.lang.String;

/** Replace in the text words with a length of 5 characters for a string*/

final class StringExercise2 {

  public static void main(String[] args) {
    StringBuilder text = new StringBuilder("Each_ Java source file contains a single public class or inter");
    String replacement = "xxx";
    int lastSeparatorIdx = -1;
    String separator = " ";
    do {
      int wordStartIdx = lastSeparatorIdx + separator.length();
      int nextSeparatorIdx = text.indexOf(separator, wordStartIdx); /*Returns the index within this string of the first occurrence of the
        specified substring, starting at the specified index. str -  the substring to search for/fromIndex -  the index from which to start the
        search.*/
      int firstIdxAfterWord;
      if (nextSeparatorIdx == -1) { /*If no such value of {@code k} exists, then {@code -1} is returned.*/
        firstIdxAfterWord = text.length();
      } else {
        firstIdxAfterWord = nextSeparatorIdx;
      }
      int wordLength = firstIdxAfterWord - wordStartIdx;
      if (wordLength == 5) {
        text.replace(wordStartIdx, firstIdxAfterWord, replacement);
      }
      lastSeparatorIdx = nextSeparatorIdx;
    } while (lastSeparatorIdx != -1);
    System.out.println(text);
  }
}


//      String text = "Each Java source files contains a single public class or interface";
//      String[] splitString = text.split(" ");
//      String newString = "";
//
//      for (int i = 0; i < splitString.length; i++) {
//        if (splitString[i].length() == 5) {
//          StringBuilder sb = new StringBuilder(splitString[i]);
//          sb.replace(0, 4, "f");
//          newString += sb.toString().concat(" ");
//        }
//      }
//      System.out.println(newString);
//    }
//  }
//}
