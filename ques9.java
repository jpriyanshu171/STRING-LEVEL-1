import java.util.Scanner;

public class ques9 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a string:");
                    String s = sc.nextLine();
                    s.toLowerCase();
                    boolean isPalindrome = true;
                    int length = s.length();
                    for (int i = 0; i < length / 2; i++) {
                              if (s.charAt(i) != s.charAt(length - i - 1)) {
                                        isPalindrome = false;
                              }
                    }
                    if (isPalindrome) {
                              System.out.println(s + " is a palindrome");
                    } else {
                              System.out.println(s + " is not a palindrome");
                    }
          }
}
