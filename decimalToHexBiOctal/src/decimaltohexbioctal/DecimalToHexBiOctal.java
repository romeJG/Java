
package decimaltohexbioctal;
import java.util.Scanner;
public class DecimalToHexBiOctal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String chh;
        System.out.print("[1]Decimal > Binary\n[2]Decimal > Octal\n[3]Decimal > Hexa\nChoose: ");
        chh = input.next();
        
        switch(chh){
            
            case "1":
                System.out.print("Enter a positive decimal number: ");
                int n=input.nextInt();
                int  bi[]=new int[100];
                int i = 0;
                while(n > 0){
                   bi[i++] = n%2;
                   n = n/2;
                }
               System.out.print("Binary number is : ");
                for(int j = i-1;j >= 0;j--){
                   System.out.print(bi[j]);
               }
               break;
            case "2":
                System.out.print("Enter a positive decimal number : ");
                n =input.nextInt();
                int oct = 0;
                i=1;
                while (n != 0)
                {
                    oct += (n % 8 ) * i;
                    n /= 8;
                    i *= 10;
                }
                System.out.print("Octal number is : "+oct);
                break;
            case"3":
                char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                int rem,num;
                String hexadecimal=""; 
                Scanner sc = new Scanner(System.in);   
                System.out.println("Enter a Positive Decimal number: ");
                num=sc.nextInt();
                System.out.print("Hexadecimal number is : ");
                while(num != 0)
                {
                    rem=num%16;
                    hexadecimal= ch[rem] + hexadecimal;
                    num= num/16;
                }   
                System.out.print(hexadecimal); 
                break;
        }
        
    }
    
}
