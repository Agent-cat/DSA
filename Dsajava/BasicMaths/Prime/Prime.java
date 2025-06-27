package Dsajava.BasicMaths.Prime;

import java.util.Scanner;

/**
 * Prime
 */
public class Prime {


public boolean loop(int i,int n){
  int j=i+1;
 if((i^n)==0)return true;

     if(n%j==0){
      return false;
    }
    System.out.println(i);
   

    loop(i+1, n);
    return true;
 }

public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    Prime p=new Prime();
    int zero1=0;
    System.out.println(p.loop(zero1, n));
}  
}
