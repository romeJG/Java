package gradingprogram;
import java.util.Scanner; 

public class Gradingprogram {
    
public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Quiz 1 = ");
        double q1  = input.nextDouble();
        System.out.print("Quiz 2 = ");
        double q2  = input.nextDouble();
        System.out.print("Midterm Exam = ");
        double mte  = input.nextDouble();
        System.out.print("Final Exam = ");
        double fe  = input.nextDouble();
        q1*=5;
        q2*=5;
        double q = q1+q2;
        double grade = (q*0.25)+(mte*0.25)+(fe*.50);
        System.out.println("yout grade is "+grade);
        if(grade<60){
            System.out.println("F");
        }else if(grade<70){
            System.out.println("D");
        }else if(grade<80){
            System.out.println("C");
        }else if(grade<90){
            System.out.println("B");
        }else if(grade<=100){
            System.out.println("A");
        }
    }
    
}
