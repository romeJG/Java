/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 *
 * @author Ea
 */
public class Function {
     public static Scanner scan;
    public static String id,FirstName,LastName,Gender,PhoneNumber,Address,Tbal;
    public static void main(String[] args) {
          
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
        String id="",FirstName="",LastName="",Gender="",PhoneNumber="",Address="",bal="";
        try{
            FileWriter fw =new FileWriter(tempFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            scan = new Scanner(new File(f));
            scan.useDelimiter("[,\n]");
            
            while(scan.hasNext()){
                id=scan.next();
                FirstName=scan.next();
                LastName=scan.next();
                Gender=scan.next();
                PhoneNumber=scan.next();
                Address=scan.next();
                bal=scan.next();
                if(!id.equals(s)){
                    pw.println(id+","+FirstName+","+LastName+","+Gender+","+PhoneNumber+","+Address+","+bal);
                }
            }
            scan.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(f);
            newFile.renameTo(dump);
            System.out.println("Record Deleted");
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
 
    
    public static void updateRecord (String f){
        String tempFile = "temp.txt";
        File oldFile = new File(f);
        File newFile = new File(tempFile);
        String idNo="",FirstName="",LastName="",Gender="",PhoneNumber="",Address="",bal="";
        try{
            FileWriter fw =new FileWriter(tempFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            scan = new Scanner(new File(f));
            scan.useDelimiter("[,\n]");
            
            while(scan.hasNext()){
                id=scan.next();
                FirstName=scan.next();
                LastName=scan.next();
                Gender=scan.next();
                PhoneNumber=scan.next();
                Address=scan.next();
                bal=scan.next();
                if(id.equals(id)){
                    pw.println(id+","+FirstName+","+LastName+","+Gender+","+PhoneNumber+","+Address+","+Tbal);
                }
                else{
                    pw.println(id+","+FirstName+","+LastName+","+Gender+","+PhoneNumber+","+Address+","+bal);
                }
            }
            scan.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(f);
            newFile.renameTo(dump);
            System.out.println("Record Updatted!");
        }catch(Exception e){
            System.out.println("Error Updating");
        }
    }
}
