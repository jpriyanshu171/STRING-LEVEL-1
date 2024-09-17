import java.util.Scanner;

public class ques7 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the day name:");
                    String day = sc.nextLine().trim().toLowerCase();
                    int dayNumber;
                    switch (day) {
                              case "monday":
                                        dayNumber = 1;
                                        break;
                              case "tuesday":
                                        dayNumber = 2;
                                        break;
                              case "wednesday":
                                        dayNumber = 3;
                                        break;
                              case "thursday":
                                        dayNumber = 4;
                                        break;
                              case "friday":
                                        dayNumber = 5;
                                        break;
                              case "saturday":
                                        dayNumber = 6;
                                        break;
                              case "sunday":
                                        dayNumber = 7;
                                        break;

                              default:
                                        dayNumber = -1;
                                        break;
                    }
                    if (dayNumber == -1) {
                              System.out.println("Day doesn't exists!hjg");
                    } else {
                              System.out.println(day + ":" + dayNumber);

                    }
          }
}
