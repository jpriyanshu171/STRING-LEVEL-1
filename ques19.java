import java.util.Scanner;

public class ques19 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a string:");
                    String s = sc.nextLine();
                    String result = titleCase(s);
                    System.out.println("Title case string = " + result);
          }

          public static String titleCase(String s) {
                    String words[] = s.split("\\s+");
                    for (int i = 0; i < words.length; i++) {
                              words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
                    }
                    return String.join(" ", words);
          }
}
