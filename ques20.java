import java.util.Scanner;

public class ques20 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a string:");
                    String s = sc.nextLine();
                    String words[] = s.split(" ");
                    System.out.println("Words with length greater than 5 = ");
                    for (String word : words) {
                              if (word.length() > 5) {
                                        System.out.println(word);
                              }
                    }
          }
}
