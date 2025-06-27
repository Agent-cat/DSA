// take and input for ex 5 and return 5,4,3,2,1 using recursion;

package Dsajava.Recursion;

import java.util.Scanner;

/**
 * RecursionTask
 */
public class RecursionTask {

  public int printnum(int n){
    if(n<=1){
      return 1;
    }
    System.out.println(n);
    return printnum(n-1);
  }

  public int SumNum(int n){
    
    if(n<=1)return 1;

    return n+SumNum(n-1);

  }

  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the input");
    int x =sc.nextInt();
    RecursionTask rt=new RecursionTask();
    System.out.println("Numbers : ");
    System.out.println(rt.printnum(x));
    System.out.println("Sum of numbers : ");
    System.out.println(rt.SumNum(x));
    sc.close();
  }

}
