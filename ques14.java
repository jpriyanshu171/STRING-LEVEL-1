import java.util.Scanner;

public class ques14 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a string:");
                    String s1 = sc.nextLine().trim().toLowerCase();
                    String s2 = s1.replace("15 august", "26 january").replace("independence", "republic");
                    System.out.println("Modified string = " + s2);
          }
}