import java.util.Scanner;

public class ques16 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter 5 names:");
                    String names[] = new String[5];
                    for (int i = 0; i < 5; i++) {
                              names[i] = sc.nextLine();
                    }
                    System.out.println("Names starting with a vowel:");
                    for (String name : names) {
                              if (isVowel(name.charAt(0))) {
                                        System.out.println(name);
                              }
                    }
          }

          public static boolean isVowel(char c) {
                    c = Character.toLowerCase(c);
                    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
          }
}
