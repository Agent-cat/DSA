package Dsajava.Fundamentals;

import java.util.Scanner;

/**
 * when we change the digits using ~ operator it ill change alll the 32 
 * bits to 1 so we need to create a mask 
 * if ~ number is 11111111010
 * mask = 00000001111
 */
public class Masking {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
    int mask=0;
    int num =x;
  while(x!=0){
    mask=mask<<1|1;
    num >>=1;
  }
System.out.println((~x)&mask);
  }
  
}
