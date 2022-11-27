
package pkgcase.study;

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TEJUCO {
    public static Scanner scan;
    public static String TidNo,TfName,TlName,Tgender,Tphone,Taddress,Tbal;
    public static void main(String[] args) {
           MenuUI menu = new MenuUI();
           menu.setVisible(true);
    }
    public static void write(String s, File f) throws IOException{
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
            JOptionPane.showMessageDialog(null, "Record deleted!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error deleting");
        }
    }
    
    public static Boolean searchIfExist (String f, String s){
        try {
            scan = new Scanner(new File(f));
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found please add a person");
        }
        scan.useDelimiter("[,\n]");
        String idNo="",fName="",lName="",gender="",phone="",address="",bal="";
        while(scan.hasNext()){
                idNo=scan.next();
                fName=scan.next();
                lName=scan.next();
                gender=scan.next();
                phone=scan.next();
                address=scan.next();
                bal=scan.next();
                if(idNo.equals(s)){
                    //if the id number exist returns true to close the update search
                    TidNo=idNo; 
                    TfName=fName;
                    TlName=lName;
                    Tgender=gender;
                    Tphone=phone;
                    Taddress=address;
                    Tbal=bal;
                    return(true);
                    
                }else {
                    JOptionPane.showMessageDialog(null, "This ID number does not exist");
                    
                }
            }
        return (false);
    }
    
    public static void updateRecord (String f){
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
                if(idNo.equals(TidNo)){
                    pw.println(TidNo+","+TfName+","+TlName+","+Tgender+","+Tphone+","+Taddress+","+Tbal);
                }
                else{
                    pw.println(idNo+","+fName+","+lName+","+gender+","+phone+","+address+","+bal);
                }
            }
            scan.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(f);
            newFile.renameTo(dump);
            JOptionPane.showMessageDialog(null, "Record Updated!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Updating");
        }
    }
    
}


