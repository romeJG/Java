
package calculator;

import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 
        int a,b;
        Opperation x[] = new Opperation[5];//polymorphic array
        x[0]=new Add();//sets x[]into an object 
        x[1]=new Min();
        x[2]=new Mul();
        x[3]=new Div();
        x[4]=new Mod();
        System.out.print("First Number: ");
        a = input.nextInt();
        System.out.print("Second Number: ");
        b = input.nextInt();
        
        for (int i=0;i<5;i++){
            x[i].opp(a,b);
        }
    }

    
}


