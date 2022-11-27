
package testcasestudy;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Testcasestudy {
private static Scanner scan;
    public static void main(String[] args) {
    
    
    }
    
     public static void write (String s, File f) throws IOException{
        FileWriter fw = new FileWriter(f,true);
        fw.write(s);
        fw.close();
    }
    public static void deleteRecord (String f, String s){
        String tempFile = "temp.txt";
        File oldFile = new File(f);
        File newFile = new File(tempFile);
        String idNo="",fName="",lName="",gender="",phone="",address="",bal="";
        try{
            FileWriter fw =new FileWriter(tempFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            scan = new Scanner(new File(f));
            scan.useDelimiter("[,\n]");
            
            while(scan.hasNext()){
                idNo=scan.next();
                fName=scan.next();
                lName=scan.next();
                gender=scan.next();
                phone=scan.next();
                address=scan.next();
                bal=scan.next();
                if(!idNo.equals(s)){
                    pw.println(idNo+","+fName+","+lName+","+gender+","+phone+","+address+","+bal);
                }
            }
            scan.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(f);
            newFile.renameTo(dump);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error deleting");
        }
    }
}
