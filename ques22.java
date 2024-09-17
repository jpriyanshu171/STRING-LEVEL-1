import java.util.Scanner;

public class ques22 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a string:");
                    String s = sc.nextLine();
                    String words[] = s.split("\\s+");
                    System.out.println("Words with double sequence = ");
                    for (String word : words) {
                              if (doubleSequence(word)) {
                                        System.out.println(word);
                              }
                    }
          }

          public static boolean doubleSequence(String word) {
                    for (int i = 0; i < word.length() - 1; i++) {
                              if (word.charAt(i) == word.charAt(i + 1)) {
                                        return true;
                              }
                    }
                    return false;
          }
}
