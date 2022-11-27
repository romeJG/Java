
package calculator;

import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 
        int a,b;
        Opperation arr[] = new Opperation[5];//polymorphic array
        arr[0]=new Add();//sets x[]into an object 
        arr[1]=new Min();
        arr[2]=new Mul();
        arr[3]=new Div();
        arr[4]=new Mod();
        System.out.print("First Number: ");
        a = input.nextInt();
        System.out.print("Second Number: ");
        b = input.nextInt();
        
        for (int i=0;i<5;i++){
            arr[i].opp(a,b);
        }
    }

    
}


