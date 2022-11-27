
package intrestbulshit;
import java.util.Scanner;
public class IntrestBulshit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ch;
        double interest = 0,totalBal=0,temp=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Eneter Account Balance: ");
        double bal = input.nextDouble();
        System.out.print("Enter Intrest Rate: ");
        double ir = input.nextDouble();
        ir/=100;
        System.out.print("[1]Daily\n[2]Monthly\n[3]Anually\nChoose: ");
        ch = input.next();
        switch(ch){
            case "1":
                System.out.println("you choose Daily");
                for(int i=0;i<3650;i++){
                    temp=bal*ir;
                    interest+=temp;
                }
                totalBal=bal+interest;
                System.out.println("Daily interest in 10 years: "+totalBal);
                break;
            case "2":
                System.out.println("you choose Monthly");
                for(int i=0;i<120;i++){
                    temp=bal*ir;
                    interest+=temp;
                }
                totalBal=bal+interest;
                System.out.println("Monthly interest in 10 years: "+totalBal);
                break;
            case "3":
                System.out.println("you choose Yearly");
                for(int i=0;i<10;i++){
                    temp=bal*ir;
                    interest+=temp;
                }
                totalBal=bal+interest;
                System.out.println("Yearly interest in 10 years: "+totalBal);
                break;
            default:
                break;
        }
    }
    
}
