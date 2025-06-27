package Dsajava.Fundamentals;

import java.util.Scanner;

/**
 * DecimaltoBinaryUsingBits
 * This class demonstrates how to convert a decimal number to its binary
 * representation using bitwise operations.
 
 * Step:1 -- Find the last bit of the number 
   Step:2 -- Append it to the String
   Step:3 -- RightShift the number 
 
 */
public class DecimaltoBinaryUsingBits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int number = sc.nextInt();
    String result = "";
    while (number != 0) {

      int lastbit = number & 1; //find the last bit and append it to the string
      result = lastbit + result;
      number = number >> 1;
    }

    System.out.println(result);

    sc.close();

  }

}
