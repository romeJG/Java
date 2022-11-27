
package basta;
//import java.io.BufferedReader; //gagamitin si bufferd reader
import java.io.IOException;//input output exception
import java.io.InputStreamReader;//for accepting and displaying 
import java.util.Scanner;
public class Basta {

    public static void main(String[] args) throws IOException {
        int a;
        float b;
        //String output;
        Scanner input = new Scanner (System.in);
        //BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
                System.out.println("enter a int: ");
                a = input.nextInt();
                System.out.println("your int "+a);
                
                System.out.println("enter a float ");
                b = input.nextFloat();
                System.out.println("the float you entered "+b);
                
                System.out.println("enter a string ");
                String output = input.nextLine();
                System.out.println("this is your string "+output);
    }
    
}
