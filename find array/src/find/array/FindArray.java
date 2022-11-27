
package find.array;
import java.util.Scanner; 
public class FindArray {
    private static final String[] contents = {
         " one",
         " two",
         " three",
         " four",
         " five",
         " six",
         " seven",
         " eight",
         " nine"
    };
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=1;
        do{
            System.out.print("enter a index position: ");
            int ch= input.nextInt();
            try {
                for (int i=0; i<ch; i++){
                System.out.println(contents[i]);
                }
                
                x=2;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("input cant be more than nine(9)");
            }
            catch(NullPointerException e){
                System.out.println("Null Pointer");
            }
            catch(RuntimeException e){
                System.out.println("Run Time Exception");
            }
        }while(x==1);
        
    }
    
}

