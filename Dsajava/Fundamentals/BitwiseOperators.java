//[3]

package Dsajava.Fundamentals;

public class BitwiseOperators {

  public static void main(String[] args) {
    int a = 5; // 0101
    int b = 3; // 0011

    // Bitwise AND
    System.out.println("a & b: " + (a & b)); // 0001 -> 1

    // Bitwise OR
    System.out.println("a | b: " + (a | b)); // 0111 -> 7

    // Bitwise XOR
    System.out.println("a ^ b: " + (a ^ b)); // 0110 -> 6

    // Bitwise NOT
    System.out.println("~a: " + (~a)); // 1010 -> -6 (two's complement)

    // Left Shift
    System.out.println("a << 1: " + (a << 1)); // 1010 -> 10

    // Right Shift
    System.out.println("a >> 1: " + (a >> 1)); // 0010 -> 2
  }
  
}
