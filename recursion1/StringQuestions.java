package recursion1;

public class StringQuestions {
      public static int first = -1;
      public static int last = -1;
      public static boolean[] map = new boolean[26];

      public static void moveAllXsToLastOfString(String str, int index, String alphaString, String xString) {
            if (index == str.length()) {
                  System.out.println(alphaString + xString);
                  return;
            }
            if (str.charAt(index) == 'x') {
                  xString += 'x';
            } else {
                  alphaString += str.charAt(index);
            }
            moveAllXsToLastOfString(str, index + 1, alphaString, xString);
      }

      public static String removeDuplicates(String str, int index, String newString) {
            if (index == str.length()) {
                  return newString;
            }
            char currChar = str.charAt(index);
            if (map[currChar - 'a'] == false) {
                  newString += currChar;
                  map[currChar - 'a'] = true;
            }
            return removeDuplicates(str, index + 1, newString);
      }

      public static void printAllSubsequence(String str, int index, String newString) {
            if (index == str.length()) {
                  System.out.println(newString);
                  return;
            }

            char currChar = str.charAt(index);

            printAllSubsequence(str, index + 1, newString + currChar);
            printAllSubsequence(str, index + 1, newString);
      }

      public static void main(String[] args) {
            // String str1 = "axbcxxxdx";
            // moveAllXsToLastOfString(str1, 0, "", "");
            // System.out.println(removeDuplicates(str1, 0, ""));
            String str2 = "abc";
            printAllSubsequence(str2, 0, "");
      }
}
