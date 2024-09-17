import java.util.Scanner;

public class ques8 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a string:");
                    String s1 = sc.nextLine();
                    StringBuilder s2 = new StringBuilder();

                    for (int i = 0; i < s1.length(); i++) {
                              char c = s1.charAt(i);
                              if (Character.isUpperCase(c)) {
                                        s2.append(Character.toLowerCase(c));
                              } else {
                                        s2.append(Character.toUpperCase(c));
                              }
                    }
                    System.out.println("Case converted string = " + s2);
          }
}
