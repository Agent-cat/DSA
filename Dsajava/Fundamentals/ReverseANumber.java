package Dsajava.Fundamentals;

import java.util.Scanner;

/**
 * ReverseANumber
 */
public class ReverseANumber {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int result = 0;
    if (result < Integer.MIN_VALUE / 10 || result > Integer.MAX_VALUE / 10) {
      System.out.println("Value is out of bound");
    }
    while (number != 0) {
      int lastdigit = number % 10; // mod with 10 to get last digit
      result = result * 10 + lastdigit; // multiply with 10 to append in next digit
      number /= 10; // Divide by 10 to remove last digit
    }
    System.out.println(result);
    sc.close();
  }
}
