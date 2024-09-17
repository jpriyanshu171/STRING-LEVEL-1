import java.util.HashMap;
import java.util.Scanner;

public class ques18 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a string:");
                    String s = sc.nextLine();
                    HashMap<Character, Integer> freq = new HashMap<>();
                    for (int i = 0; i < s.length(); i++) {
                              if (freq.containsKey(s.charAt(i))) {
                                        int count = freq.get(s.charAt(i));
                                        freq.put(s.charAt(i), ++count);
                              } else {
                                        freq.put(s.charAt(i), 1);
                              }
                    }
                    System.out.println(freq);
          }
}
