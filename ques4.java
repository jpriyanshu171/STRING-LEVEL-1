import java.util.Scanner;

public class ques4 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a string:");
                    String s = sc.nextLine();
                    int vCount = 0;
                    s.toLowerCase();
                    for (int i = 0; i < s.length(); i++) {
                              char c = s.charAt(i);
                              if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                                        vCount++;
                              }
                    }
                    System.out.println("Vowel count is = " + vCount);
          }
}
