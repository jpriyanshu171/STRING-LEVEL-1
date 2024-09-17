import java.util.Scanner;

public class ques3 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a string:");
                    String s = sc.nextLine();
                    int capitalCount = 0;
                    for (int i = 0; i < s.length(); i++) {
                              char c = s.charAt(i);
                              if (Character.isUpperCase(c)) {
                                        capitalCount++;
                              }
                    }
                    System.out.println("No. of capital letters is = " + capitalCount);
          }
}
