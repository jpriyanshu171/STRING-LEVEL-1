import java.util.Scanner;

public class ques12 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter full name:");
                    String name = sc.nextLine().trim().toLowerCase();

                    String gender;
                    if (name.startsWith("mr.")) {
                              gender = "male";
                    } else if (name.startsWith("miss")) {
                              gender = "female";
                    } else if (name.startsWith("mrs")) {
                              gender = "married female";
                    } else if (name.endsWith("kumari")) {
                              gender = "female";
                    } else {
                              gender = "cannot determine";
                    }
                    System.out.println("Gender = " + gender);
          }
}