
package pkgcase.study;

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TEJUCO {
    public static Scanner scan;
    public static String TidNo,TfName,TlName,Tgender,Tphone,Taddress,Tbal;
    public static String PidNo,PfName,PlName,Pgender,Pphone,Paddress,
            T_OT, T_salary, T_totHrs, T_ha, T_ma, T_ta, T_net, T_dept, T_desig;
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
                phone=scan.next();// BABASAHIN YUNG FILE HABANG MAY LAMAN SIYA
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
            JOptionPane.showMessageDialog(null, e);
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
        while(scan.hasNextLine()){
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
                        scan.close();
                        return(true);

                    }else {
                        JOptionPane.showMessageDialog(null, "This ID number does not exist");

                    }
                }
        }
        scan.close();
        return (false);
    }
    
    public static Boolean P_searchIfExist (String f, String s){
        try {
            scan = new Scanner(new File(f));
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found please add a person");
        }
        
        scan.useDelimiter("[,\n]");
        String idNo="",fName="",lName="",gender="",phone="",address="",dept="", desig="",thrs="",ot="",tsal="",ha="",ma="",ta="",net="";
        
        while(scan.hasNextLine()){
            while(scan.hasNext()){
                    idNo=scan.next();
                    fName=scan.next();
                    lName=scan.next();
                    gender=scan.next();
                    phone=scan.next();
                    address=scan.next();
                    dept=scan.next();
                    desig=scan.next();
                    thrs=scan.next();
                    ot=scan.next();
                    tsal=scan.next();
                    ha=scan.next();
                    ma=scan.next();
                    ta=scan.next();
                    net=scan.next();

                    if(idNo.equals(s)){
                        //if the id number exist returns true to close the update search
                        PidNo=idNo; 
                        PfName=fName;
                        PlName=lName;
                        Pgender=gender;
                        Pphone=phone;
                        Paddress=address;
                        T_dept=dept;
                        T_desig=desig;
                        T_totHrs=thrs;
                        T_OT=ot;
                        T_salary=tsal;
                        T_ha=ha;
                        T_ma=ma;
                        T_ta=ta;
                        T_net=net;

                        return(true);

                    }else {
                        //JOptionPane.showMessageDialog(null, "This ID number does not exist");
                        scan.nextLine();
                    }
            }
        
        
    }
        return (false);
    }
    public static void P_deleteRecord (String f, String s){
        String tempFile = "temp.txt";
        File oldFile = new File(f);
        File newFile = new File(tempFile);
        String idNo="",fName="",lName="",gender="",phone="",address="",dept="", desig="",thrs="",ot="",tsal="",ha="",ma="",ta="",net="";
        
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
                    dept=scan.next();
                    desig=scan.next();
                    thrs=scan.next();
                    ot=scan.next();
                    tsal=scan.next();
                    ha=scan.next();
                    ma=scan.next();
                    ta=scan.next();
                    net=scan.next();
                    
                if(!idNo.equals(s)){
                    pw.println(idNo+","+fName+","+lName+","+gender+","+phone+","+address+","+dept+","+desig+","+thrs+","+ot+","+tsal+","+ha+","+ma+","+ta+","+net);
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
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void Pview(String f){
        try {
            scan = new Scanner(new File(f));
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found please add a person");
        }
        scan.useDelimiter("[,\n]");
        String idNo="",fName="",lName="",gender="",phone="",address="",dept="", desig="",thrs="",ot="",tsal="",ha="",ma="",ta="",net="";
        while(scan.hasNext()){
                idNo=scan.next();
                fName=scan.next();
                lName=scan.next();
                gender=scan.next();
                phone=scan.next();
                address=scan.next();
                dept=scan.next();
                desig=scan.next();
                thrs=scan.next();
                ot=scan.next();
                tsal=scan.next();
                ha=scan.next();
                ma=scan.next();
                ta=scan.next();
                net=scan.next();
        }
                    //if the id number exist returns true to close the update search
                    PidNo=idNo; 
                    PfName=fName;
                    PlName=lName;
                    Pgender=gender;
                    Pphone=phone;
                    Paddress=address;
                    T_dept=dept;
                    T_desig=desig;
                    T_totHrs=thrs;
                    T_OT=ot;
                    T_salary=tsal;
                    T_ha=ha;
                    T_ma=ma;
                    T_ta=ta;
                    T_net=net;
                    
                    
                    
                
            
        
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
                if(!idNo.equals(TidNo)){
                    pw.println(idNo+","+fName+","+lName+","+gender+","+phone+","+address+","+bal);
                    
                }
            }
            pw.println(TidNo+","+TfName+","+TlName+","+Tgender+","+Tphone+","+Taddress+","+Tbal);
            scan.close();
            pw.flush();
            pw.close();
            
            swap(f,"temp.txt");
            
            JOptionPane.showMessageDialog(null, "Record Updated!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Updating");
        }
    }

    private static void swap(String f,String t ) {
        File oldFile = new File(f);
        File newFile = new File(t);
        
        if(oldFile.delete()){
            System.out.println("file deleted");
        }
        File dump = new File(f);
        if(newFile.renameTo(dump)){
            System.out.println("file renamed");
        }
    }
    
    public static void nonzero (String f){
        try {
            scan = new Scanner(new File(f));
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found please add a person");
        }
        scan.useDelimiter("[,\n]");
        String idNo="",fName="",lName="",gender="",phone="",address="",bal="";
        while(scan.hasNextLine()){
            while(scan.hasNext()){
                    idNo=scan.next();
                    fName=scan.next();
                    lName=scan.next();
                    gender=scan.next();
                    phone=scan.next();
                    address=scan.next();
                    bal=scan.next();
                    int bb=Integer.parseInt(bal);
                    if(!(0==bb)) //if bal is not zero
                    System.out.println(idNo+","+fName+","+lName+","+gender+","+phone+","+address+","+bal);
                    }
               }
        scan.close();
        }
        
    
    
    }
    



