
package numbers.to.words;
import java.util.Scanner; 
public class NumbersToWords {

    public static void main(String[] args) {
        String ch;
        System.out.println("[1]Number > words"
                         + "\n[0]Exit");
        Scanner input = new Scanner(System.in);
        ch = input.nextLine();
        
        do{
            
            switch(ch){
                case"1":
                    System.out.println("Number > Words");
                    romnum.enter();
                    break;
                case"0":
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
            
        }while(!"0".equals(ch));
    }
    
}

class romnum extends NumbersToWords {
    public static void enter(){
        String ch="";
        int in=0,x=1;
        do{
            do{
                try{
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter A Arabic Number:");
                    ch = input.nextLine();
                    in = Integer.parseInt(ch);
                    x=2;
                }
                catch(NumberFormatException e) {
                    System.out.println(ch+ " is an invalid input Invalid Input.");               
                }
                if(in<1|in>3999)
                    System.out.println("Number Range is only 1 - 3999");
            }while(in<1|in>3999);
        }while(x==1);
        System.out.println(numberToWord(in));    
    
    }
    
    private static String numberToWord(int number) {
        // variable to hold string representation of number 
        String words = "";
        String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", 
                      "seven", "eight", "nine", "ten", "eleven", "twelve",
                      "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
                      "eighteen", "nineteen" };
	String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                      "sixty", "seventy", "eighty", "ninety" };
 
	if (number == 0) {
	    return "zero";
	}
	// add minus before conversion if the number is less than 0
	if (number < 0) { // convert the number to a string 
           String numberStr = "" + number; 
           // remove minus before the number 
           numberStr = numberStr.substring(1); 
           // add minus before the number and convert the rest of number 
           return "minus " + numberToWord(Integer.parseInt(numberStr));
        } 
        // check if number is divisible by 1 million
        if ((number / 1000000) > 0) {
	   words += numberToWord(number / 1000000) + " million ";
	   number %= 1000000;
	}
	// check if number is divisible by 1 thousand
	if ((number / 1000) > 0) {
	    words += numberToWord(number / 1000) + " thousand ";
	    number %= 1000;
	}
	// check if number is divisible by 1 hundred
	if ((number / 100) > 0) {
	     words += numberToWord(number / 100) + " hundred ";
	     number %= 100;
	}
 
	if (number > 0) {
	     // check if number is within teens
	     if (number < 20) { 
                // fetch the appropriate value from unit array 
                words += unitsArray[number];
             } else { 
                // fetch the appropriate value from tens array 
                words += tensArray[number / 10]; 
                if ((number % 10) > 0) {
		    words += "-" + unitsArray[number % 10];
                }  
	     }
          }
 
	  return words;
   }
}
