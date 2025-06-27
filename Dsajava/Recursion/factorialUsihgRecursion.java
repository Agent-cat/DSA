// Take input from user and find its factorial using recursion

package Dsajava.Recursion;

import java.util.Scanner;
/**
 * factorialUsihgRecursion
 */
public class factorialUsihgRecursion {
  
  public int recursion(int n){
    
    if(n<=1){
      return 1;
    }

    return n*recursion(n-1); //Here the function id calling itself 
  }

  public static void main(String[] args) {
  System.out.println("Enter the Number");
  Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    factorialUsihgRecursion rec=new factorialUsihgRecursion();
    System.out.println(rec.recursion(n));
    sc.close();
  }
}
