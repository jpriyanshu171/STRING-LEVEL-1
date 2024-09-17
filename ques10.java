import java.util.Scanner;

public class ques10 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a string:");
                    String s = sc.nextLine();
                    System.out.println("Enter starting index");
                    int startIndex = sc.nextInt();
                    System.out.println("Enter ending index:");
                    int endIndex = sc.nextInt();
                    if (startIndex >= 0 && endIndex <= s.length()) {
                              String s2 = s.substring(startIndex, endIndex);
                              System.out.println("Extracted substring=" + s2);
                    } else {
                              System.out.println("Invalid indices!");
                    }
          }
}