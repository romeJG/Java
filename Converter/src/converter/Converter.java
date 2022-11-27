
package converter;
import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        float a;
        
        Scanner input = new Scanner (System.in);        
        System.out.print("Enter Philipine peso: ");
        a = input.nextFloat();
        System.out.println("\n\nThe ammount's equivalent to:");
        System.out.println("Us dollars\t:\t"+(a*0.019));       
        System.out.println("Euro\t\t:\t"+(a*0.017));
        System.out.println("Yuan\t\t:\t"+(a*0.14));
        System.out.println("Koruna\t\t:\t"+(a*0.45));
        System.out.println("Sheqel\t\t:\t"+(a*0.068));
        System.out.println("Dinar\t\t:\t"+(a*0.0058));
        
    }
    
}
