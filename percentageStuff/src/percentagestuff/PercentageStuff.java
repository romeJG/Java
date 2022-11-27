
package percentagestuff;
import java.util.Scanner;

public class PercentageStuff {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num[]= new int[100],sum=0,temp=0,perc=0;
        System.out.println("How Many integers Will you Enter?");
        int i = input.nextInt();
        System.out.println("Enter "+i+" one digit per line");
        for(int j=0;j<i;j++){
            num[j]=input.nextInt();
        }
        for(int j=0;j<i;j++){
            sum+=num[j];
        }
        System.out.println("the sum is "+sum);
        for(int j=0;j<i;j++){
            perc=(num[j]*100/sum);
            System.out.println(num[j]+" which is "+perc+"% of the sum");
        }
    }
    
}

