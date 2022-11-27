
package encapsulation;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public  class Encapsulation {

public static void main(String args[]){
    Scanner input = new Scanner (System.in);
    double a  , b;
    EncapThis demo = new EncapThis();
    NumberFormat x = new DecimalFormat ("#0.00");

      
      System.out.print("Enter first number:");
      a = input.nextDouble();
      System.out.print("Enter second number:");
       b = input.nextDouble();
      System.out.println("The sum of two numbers are\n" + x.format(demo.getAddition(a,b))); //makes the decimal places to two
      System.out.println("The difference of two numbers are\n" + x.format(demo.getSubtraction(a, b)));
      System.out.println("The product of two numbers are\n" + x.format(demo.getMultiplication(a, b)));
      System.out.println("The quotient of two numbers are\n" + x.format(demo.getDivision(a,b)));
      System.out.println("The mode of two numbers are\n" + demo.getModulo(a,b));
      
}
}