
package bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferedreader {

    public static void main(String[] args) throws IOException {
        BufferedReader x = new BufferedReader
	  (new InputStreamReader(System.in));
	  
	double grade1,grade2,grade3,sum,average;	

	System.out.print ("Enter Your First Grade  : ");
	grade1 = Integer.parseInt( x.readLine());
	
	System.out.print ("Enter Your Second Grade : ");
	grade2 = Integer.parseInt( x.readLine());
	
	System.out.print ("Enter Your Third Grade : ");
	grade3 = Integer.parseInt( x.readLine());
	
	sum = grade1 + grade2 + grade3;
	average = sum/3;
	
	if (average>=60){
            System.out.println(average+":D");
        }else{
            System.out.println(":(");
        }
    }
    
}
