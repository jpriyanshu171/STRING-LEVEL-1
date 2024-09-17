// If the word starts with a vowel, we simply add "yay" to the end of the word.
// If the word starts with a consonant, we move all the characters before the first vowel to the end and then add "ay".

import java.util.Scanner;

public class ques11 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a string:");
                    String s = sc.nextLine().trim().toLowerCase();
                    String pigLatinWord;
                    if (isVowel(s.charAt(0))) {
                              pigLatinWord = s + "yay";
                    } else {
                              int vowelIndex = findFirstVowel(s);
                              if (vowelIndex == -1) {
                                        pigLatinWord = s + "ay";
                              } else {
                                        pigLatinWord = s.substring(vowelIndex) + s.substring(0, vowelIndex) + "ay";
                              }
                    }
                    System.out.println("Pig Latin form: " + pigLatinWord);

          }

          public static boolean isVowel(char c) {
                    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
          }

          public static int findFirstVowel(String s) {
                    for (int i = 0; i < s.length(); i++) {
                              if (isVowel(s.charAt(i))) {
                                        return i;
                              }
                    }
                    return -1;
          }
}
