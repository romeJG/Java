package debg;
import java.util.Scanner;


public class Debg {
    
static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        int score;
        
        System.out.println("Enter your score: ");
        score = input.nextInt();
        
        if (score>=75)
        {
            System.out.println("Your score " + score + "passed.");
        }else
            System.out.println("Your score" + score + "failed.");
    }
    
}
