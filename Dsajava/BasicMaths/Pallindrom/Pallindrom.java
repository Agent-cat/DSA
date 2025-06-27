package Dsajava.BasicMaths.Pallindrom;

import java.util.Scanner;

/**
 * Pallindrom
 */
public class Pallindrom {
  public static void main(String[] args) {
    
  Scanner sc =new Scanner(System.in);
      
    System.out.println("Enter the Number");

    int n=sc.nextInt();
    int value=1;
    for(int i=n;i>0;i--){
    value*=i;
    }
    sc.close();
    System.out.println(value);
  }

  
}
