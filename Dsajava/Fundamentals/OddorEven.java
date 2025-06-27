//[2]

// Find tthe number is odd or even without using % opperator

// we can find if a number is odd or even by (number&1)==0 
// ex: 11 & 1 == 1011 & 0001 == 0001

package Dsajava.Fundamentals;

import java.util.Scanner;

public class OddorEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int number = sc.nextInt();

    if ((number & 1) == 0) {
      System.out.println("The Number is Even");
    } else {
      System.out.println("The Number is Odd");
    }
    
    sc.close();
  }
}

