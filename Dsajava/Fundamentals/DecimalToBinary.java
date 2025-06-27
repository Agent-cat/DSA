//[1]

package Dsajava.Fundamentals;
import java.util.Scanner;

public class DecimalToBinary {

public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
   int number =sc.nextInt();
     while(number!=0){
       int rem=number%2;
       number=number/2;
      System.out.print(rem);
     }
 sc.close();  

}
}
