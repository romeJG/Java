
package trycatchfinal;
import java.util.Scanner;


public class Trycatchfinal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int next=1;
        do{
            System.out.print("Enter first num: ");
            String sn1 = input.nextLine();
            System.out.print("Enter second num: ");
            String sn2 = input.nextLine();
            try{
            int in1 = Integer.parseInt(sn1);
            int in2 = Integer.parseInt(sn2);
            int sum= in1+in2;
            System.out.println(sum);
            next=2;
            }
            catch(Exception e){
                System.out.println("Enter a valid number");
            }            
        }while(next==1);
    }
}