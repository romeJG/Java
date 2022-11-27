
package abstraction;
import java.util.Scanner;

public abstract class Abstraction {

  
        public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a,b;
          
      Sup demo[] = new Sup[6];
        demo[0]=new Add() {
            @Override
            public void compute() {
               
            }
        };
        demo[1]=new Subt() {
            @Override
            public void compute() {
               
            }
        };
        demo[3]=new Divide() {
            @Override
            public void compute() {
                
            }
        };
        demo[2]=new Multi() {
            @Override
            public void compute() {
                
            }
        };
        demo[4]=new Mode() {
            @Override
            public void compute() {
                
            }
        };
        System.out.print("First Number: ");
        a = input.nextInt();
        System.out.print("Second Number: ");
        b = input.nextInt();
        
        for (int i=0;i<5;i++){
            demo[i].compute(a,b);
        }
    }
    
    }
    

