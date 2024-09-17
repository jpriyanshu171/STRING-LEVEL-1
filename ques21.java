import java.util.Scanner;

public class ques21 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a string:");
                    String s = sc.nextLine();
                    String words[] = s.split(" ");
                    System.out.println("Palindrome words:");
                    for (String word : words) {
                              if (isPalindrome(word)) {
                                        System.out.println(word);
                              }
                    }
          }

          public static boolean isPalindrome(String word) {
                    int len = word.length();
                    for (int i = 0; i < len / 2; i++) {
                              if (word.charAt(i) != word.charAt(len - 1 - i)) {
                                        return false;
                              }
                    }
                    return true;
          }
}