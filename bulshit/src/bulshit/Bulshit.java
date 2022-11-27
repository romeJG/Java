
package bulshit;

public class Bulshit {

    public static void main(String[] args) {
        String Studentarray[][]={{"peter", "75","77"},
                                 {"clark", "78", "80"},
                                 {"logan","82","84"}};
        for (int i = 0; i<3;i++){
            for (int j = 0; j<3;j++){
                System.out.print(Studentarray[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
