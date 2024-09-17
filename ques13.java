import java.util.Scanner;

public class ques13 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter first string:");
                    String s1 = sc.nextLine();
                    System.out.println("Enter second string:");
                    String s2 = sc.nextLine();
                    int result = s1.compareTo(s2);
                    if (result < 0) {
                              System.out.println("The string /" + s2 + "/ comes later in lexicographical order");
                    } else if (result > 0) {
                              System.out.println("The string /" + s1 + "/ comes later in lexicographical order");
                    } else {
                              System.out.println("Both the strings are equal");
                    }
          }
}