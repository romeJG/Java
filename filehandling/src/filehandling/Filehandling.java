package filehandling;
import java.io.File;
import java.util.*;
import java.lang.*;

public class Filehandling {
static Formatter x;
static Scanner y;
    public static void main(String[] args) {
        openfile();
        addrecords();
        closefile();
    }
    
    public static void fopenfile(){
    try{
            x = new Formatter("test.txt");
            System.out.println("file created");
        }
        catch(Exception e){
            System.out.println("error creating file");
        }
    }
    
    public static void addrecords(){
        x.format("%s%s%s","12343 ","first1 ","last2 ");
                //three strings id fnln
    }
    public static void closefile(){
        x.close();
    }
    public static void sopenfile(){
    try {
        y = new Scanner (new File("test.txt"));
    } catch (Exception e) {
        System.out.println("error");
    }
    }
    
    public static void readfile(){
        while(y.hasNext()){
            String id = y.next();
            String fn = y.next();
            String ln = y.next();
            System.out.println("%s %s %s",id,fn,ln);
        }
    }
}
