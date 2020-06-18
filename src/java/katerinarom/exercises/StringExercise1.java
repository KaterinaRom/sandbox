package katerinarom.exercises;
import java.util.Scanner;
import java.lang.String;

/** In the text, replace each letter with its serial number in the alphabet.
When outputting in one line, print the text with two spaces between the letters,
in the next line below each letter print its number.
*/

final class StringExercise1 {
  static int unknownCharacter = -1;

  public static void main(String[] args) {
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    String text = "java is a programming language";
    int unknownCharacter = -1;

    /**text to char[]*/
    char[] splitText = text.toCharArray();
    for (int i = 0; i < splitText.length; i++) {
      System.out.print(splitText[i] + "  ");
    }
    System.out.println();
    for (int i = 0; i < splitText.length; i++) {
      int characterIdx = idx(alphabet, splitText[i]);
      if (characterIdx == unknownCharacter) {
        System.out.print("   ");
      } else if (characterIdx >= 10) {
        System.out.print(characterIdx + " ");
      } else {
        System.out.print(characterIdx + "  ");
      }
    }
  }

  /**character to character idx in alphabet*/
  private static int idx(char[] alphabet, char character) {
    for (int i = 0; i < alphabet.length; i++) {
      if (character == alphabet[i]) {
        return i;
      }
    } return unknownCharacter;
  }
}
