package Dsajava.Recursion;

import java.util.Scanner;

/**
 * XtoThePowerN
 */
public class XtoThePowerN {  

public int power(int x, int n) { // using recursion 
  if (n == 0) return 1;
  return x * power(x, n - 1);
}

public int iterative(int x, int n) {
  int result = 1;
  for (int i = 0; i < n; i++) {
    result *= x;
  }
  return result;
}

 public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
    System.out.println("Enter x : ");
    int x=sc.nextInt();
    System.out.println("Enter N : ");
    int n=sc.nextInt();
    XtoThePowerN p=new XtoThePowerN();
    
    System.out.println(p.iterative(x,n));
    System.out.println(p.power(x, n));
    
  sc.close();
 } 
}
