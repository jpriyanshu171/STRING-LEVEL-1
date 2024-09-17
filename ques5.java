import java.util.Scanner;

public class ques5 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a string:");
                    String s = sc.nextLine();
                    int wCount = 0;
                    for (int i = 0; i < s.length(); i++) {
                              if (s.charAt(i) == ' ') {
                                        wCount++;
                              }
                    }
                    wCount++;
                    System.out.println("Words count = " + wCount);
          }
}
