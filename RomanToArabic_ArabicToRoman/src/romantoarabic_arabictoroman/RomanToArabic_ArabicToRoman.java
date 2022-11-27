
package romantoarabic_arabictoroman;
import java.util.Scanner; 


public class RomanToArabic_ArabicToRoman {

    public static void main(String[] args) {
        String ch;
        do{
            System.out.println("[1]Roman > Arabic"
                             + "\n[2]Arabic > Roman"
                             + "\n[0]Exit");
            Scanner input = new Scanner(System.in);
            ch = input.nextLine();
            
            switch(ch){
                case "1":
                    System.out.println("You Choose Roman > Arabic");
                    romar.enter();
                    break;
                case "2":
                    System.out.println("You Choose Arabic > Roman");
                    arrom.enter();
                    break;
                case"0":
                    System.out.println("bye.");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            
        }while(!"0".equals(ch));
    }
    
}


class romar extends RomanToArabic_ArabicToRoman {
    public static void enter(){
        int ch;
        int[]  numbers[];
        
        do{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Arabic Number:");
        ch = input.nextInt();
        try {   
        String str = input.next();  
        int x=  Integer.parseInt(str);//https://coderanch.com/t/487310/java/Check-int-int-catch
        }  
        catch(NumberFormatException e) {
        System.out.print("Type a Number, Not String");               
        }
        }while(ch<1||ch>3999);
        toRoman(ch);    
    
    }
    
    public static  void toRoman(int num) {

	  //	   Checking if the number is a valid Arabic number

		String Roman = ""; //	   This will be our result string.

		//	  Declare and Initiate our Arrays
		String onesArray[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String tensArray[] = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String hundredsArray[] = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

		//	  Get the ones in the number
		int ones = num % 10;

		//	  Get the tens
		num = (num - ones) / 10;
		int tens = num % 10;

		//	  Get the hundreds
		num = (num - tens) / 10;
		int hundreds = num % 10;

		//	  Get and write the thousands in the number to our string
		num = (num - hundreds) / 10;
		for (int i = 0; i < num; i++) {
			Roman += "M";
		}

		//	  Write the hundreds
		if (hundreds >= 1) {
			Roman += hundredsArray[hundreds - 1];
		}

		//	  Write the tens
		if (tens >= 1) {
			Roman += tensArray[tens - 1];
		}

		//	  And finally, write the ones
		if (ones >= 1) {
			Roman += onesArray[ones - 1];
		}

		//	  Return our string.
		      System.out.println(String.valueOf(Roman));
	
    }
}
 
class arrom extends RomanToArabic_ArabicToRoman {
    public static void enter(){
        String ch;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Roman Number:");
        ch = input.nextLine();
        
    romanToDecimal(ch);
    }
    // This function returns value of a Roman symbol 
    static int value(char r) 
    { 
        if (r == 'I') 
            return 1; 
        if (r == 'V') 
            return 5; 
        if (r == 'X') 
            return 10; 
        if (r == 'L') 
            return 50; 
        if (r == 'C') 
            return 100; 
        if (r == 'D') 
            return 500; 
        if (r == 'M') 
            return 1000; 
        return -1; 
    } 
  
    // Finds decimal value of a given romal numeral 
    public static void romanToDecimal(String str) 
    {
        // Initialize result 
        int res = 0; 
  
        for (int i=0; i<str.length(); i++) 
        { 
            // Getting value of symbol s[i] 
            int s1 = value(str.charAt(i)); 
  
            // Getting value of symbol s[i+1] 
            if (i+1 <str.length()) 
            { 
                int s2 = value(str.charAt(i+1)); 
  
                // Comparing both values 
                if (s1 >= s2) 
                { 
                    // Value of current symbol is greater 
                    // or equalto the next symbol 
                    res = res + s1; 
                } 
                else
                { 
                    res = res + s2 - s1; 
                    i++; // Value of current symbol is 
                    // less than the next symbol 
                } 
            } 
            else
            { 
                res = res + s1; 
                i++; 
            } 
        } 
  
        System.out.println(res);
    } 
}