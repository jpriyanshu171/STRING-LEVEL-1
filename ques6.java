import java.util.Scanner;

public class ques6 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter first string:");
                    String s1 = sc.nextLine();
                    System.out.println("Enter second string:");
                    String s2 = sc.nextLine();
                    System.out.println("Using equals(): " + s1.equals(s2));
                    System.out.println("Using ==: " + (s1 == s2));
                    System.out.println("Using comparesTo(): " + s1.compareTo(s2));
          }
}
