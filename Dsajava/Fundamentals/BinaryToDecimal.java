package Dsajava.Fundamentals;

import java.util.Scanner;

/**
 * BinaryToDecimal
 */
public class BinaryToDecimal {
public static void main(String[] args) {
  
  Scanner sc =new Scanner(System.in);
  int index=0;
    int result=0;
  int binary=sc.nextInt();
  while (binary!=0) {
      int lastdigit =binary%10;// we can getblast digit by modulus 10
      
      if(lastdigit==1){
        result= result+(int)Math.pow(2,index);
        
      }
      index=index+1;
      binary=binary/10; // to remove the last digit 
    
  }
    System.out.println(result);
    sc.close();
}
  
  
}
