
package comparethree;

import java.util.Scanner;

public class CompareThree {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];
        int max=0,sub;
            System.out.print("number 1 = ");
            numbers[0] = input.nextInt();
            System.out.print("number 2 = ");
            numbers[1] = input.nextInt();
            System.out.print("number 3 = ");
            numbers[2] = input.nextInt();
        for(int i=0; i < 2; i++){
            sub = numbers[i];
            max = ( sub > max )? sub : max;
        }
        System.out.println("the highest number is = "+ max);
    }
    
}
