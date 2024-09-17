import java.util.Scanner;

public class ques17 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a string:");
                    String s1 = sc.nextLine();
                    String newString = alternateCase(s1);
                    System.out.println("Alternate case string = " + newString);
          }

          public static String alternateCase(String s1) {
                    StringBuilder s2 = new StringBuilder();
                    for (int i = 0; i < s1.length(); i++) {
                              char c = s1.charAt(i);
                              if (i % 2 == 0) {
                                        s2.append(Character.toLowerCase(c));
                              } else {
                                        s2.append(Character.toUpperCase(c));
                              }

                    }
                    return s2.toString();
          }
}
