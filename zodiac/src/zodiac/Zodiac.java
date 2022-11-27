
package zodiac;
import java.util.Scanner;
public class Zodiac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] months = {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        String zodiac="";
        System.out.print("Enter Month: ");
        int mo = input.nextInt();
        System.out.print("Enter Day: ");
        int day = input.nextInt();
        
        if (mo==1 && day>=20){
            zodiac="Aquarius";
        }else if(mo==2 && day>=19){
            zodiac="Pisces";
        }else if(mo==3 && day>=21){
            zodiac="Aries";
        }else if(mo==4 && day>=20){
            zodiac="Taurus";
        }else if(mo==5 && day>=21){
            zodiac="Gemini";
        }else if(mo==6 && day>=21){
            zodiac="Cancer";
        }else if(mo==7 && day>=23){
            zodiac="Leo";
        }else if(mo==8 && day>=23){
            zodiac="Virgo";
        }else if(mo==9 && day>=23){
            zodiac="Libra";
        }else if(mo==10 && day>=23){
            zodiac="Scorpio";
        }else if(mo==11 && day>=23){
            zodiac="Scorpio";
        }else if(mo==12 && day>=22){
            zodiac="Saguittarius";
        }else
            zodiac="Capricorn";
        
        System.out.println("Zodiac sign for "+months[mo-1]+" "+day+" is "+zodiac);
    }
    
}
