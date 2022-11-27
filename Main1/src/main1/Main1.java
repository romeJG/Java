
package Main1;
import java.io.*;
import java.util.Scanner;
import static main1.Function.scan;


public class Main1 {
String id;
    String Firstname;
    String Lastname;
    String Gender;
    String Phonenumber;
    String Address;     
    BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
}

class Student extends Main1 {

    
   
     
     public void module(){
         Scanner mod = new Scanner( System.in );
     System.out.println("Please input how many modules would you like to register");
          
            int module = mod.nextInt();
            if(module == 0 || module > 6){
          System.out.println("Modules cannot be 0 or greater than 6");
           module();
            }
            else {
                int price = module * 525;
                System.out.println("Total amount: " + price);
                
            }
           
 }
        public void Rmodule()throws IOException{
            
        System.out.println("Repeated Modules");
        System.out.println("How many modules would you like to enroll?");
        Scanner rmod = new Scanner( System.in );
        int repeatmod = rmod.nextInt();
        if (repeatmod > 2 || repeatmod <= 0){
            System.out.println("Repeated modules cannot be 0 or more than 2");
            Rmodule();
        }
        else {
            int price = repeatmod * 110;
            System.out.println("Total price of payment is: " + price);
           AP(price);
        }
    }
  
         public void AP(int price)throws IOException{
     System.out.println("How much would you like to pay?");
        int payment = Integer.parseInt(input.readLine());
        int total = price - payment;
        System.out.println("You paid: Php" + payment);
        System.out.println("Total balance is: Php" + total);
 }
}
 

 
 
  class Teacher extends Main1{
        String Designation;
        String THours;
        String dept;
     
     
     public void dept(){
         System.out.println("You have chosen Teachers\n");
         System.out.println("Please choose department");
         System.out.println("=================");
         System.out.println("|1.Business     |");
         System.out.println("|2.Computing    |");
         System.out.println("|0.Exit         |");
         System.out.println("=================");
         Scanner dept = new Scanner( System.in );
         int cdept = dept.nextInt();
         if(cdept == 1){
             System.out.println("You have chosen business");  
             Designation();
         }
         if(cdept == 2){
              System.out.println("You have chosen Computing");
              Designation();
         }
         else{
              System.out.println("Wrong Input");
         }
     }
      public void Designation(){

         System.out.println("Please choose designation");
         System.out.println("==================|");
         System.out.println("|1.Head of Faculty|");
         System.out.println("|2.Coordinator    |");
         System.out.println("|3.Lecturer       |");
         System.out.println("|0.Exit           |");
         System.out.println("==================|");
         Scanner desig = new Scanner( System.in );
         int cdesig = desig.nextInt();
          if(cdesig == 1){
             System.out.println("You have chosen Head of Faculty");  
             
         }
            if(cdesig == 2){
             System.out.println("You have chosen Coordinatory");  
             
         }
              if(cdesig == 3){
             System.out.println("You have chosen Lecturer");  
             
         }
           else{
              System.out.println("Wrong Input");
         }   
         
     }
       public void THours(){
           int hof = 8;
           int co = 13;
           int l = 18;
           
           if(hof > 8){
               
               
           }
           if (co > 13){
               
           }
           if (l > 18){
               
           }
                
           
         
     }
 } 
    class menu extends Main1{    
    public static void main(String[] args) throws IOException {
    int exit = 0;
    Teacher t =  new Teacher();
    Student s =  new  Student();
    String oldContent = " ";
    
    
   FileWriter fw =  new FileWriter ("Student.txt");
   FileWriter tw =  new FileWriter ("Teacher.txt");

       Scanner in = new Scanner( System.in );
       
        
        System.out.println("Please choose between the two");
        System.out.println("===========");
        System.out.println("|1.Student|");
        System.out.println("|2.Teacher|");
        System.out.println("|0.Exit   |");
        System.out.println("===========");
        
        int choice = in.nextInt();
        
        do{
        switch (choice){
         
            case 1:
         
        System.out.println("You have chosen Student\n");
        System.out.println("Welcome to Student Information");
        System.out.println("Please choose in the ff:");
        System.out.println("================================================");
        System.out.println("| 1.Add Student                                 |");
        System.out.println("| 2.Update Student                              |");
        System.out.println("| 3.Delete Student                              |");
        System.out.println("| 4.Show Remaining Balance                      |");
        System.out.println("| 5.Fee Deposit                                 |");
        System.out.println("| 6.Display all students with zero balance      |");
        System.out.println("| 7.Display all students with non-zero balance  |");
        System.out.println("| 8.Add Module                                  |");
        System.out.println("| 9.Repeated Module                             |");
        System.out.println("| 10.Amount Payment                             |");
        System.out.println("| 0.Exit                                        |");
        System.out.println("================================================");
              
         int choice2 = in.nextInt();
         
         do{
        switch (choice2){
            case 1:
           Scanner  input = new Scanner (System.in);
   
           
           System.out.println("Enter Id: ");
           String id =  input.nextLine();
           fw.write("ID \t\t FirstName \t\t LastName \t\t Gender \t\t PhoneNumber \t\t Address");
           fw.write(System.lineSeparator());
           fw.write(id);
           fw.write("\t");
           
           System.out.println ("Enter FirstName: ");
           String fname = input.nextLine();
           fw.write(fname);
           fw.write("\t\t");
           
           System.out.println ("Enter LastName: ");
           String lname = input.nextLine();
           fw.write(lname);
           fw.write("\t\t");
           
           System.out.println ("Enter Gender: ");
           String gender = input.nextLine(); 
           fw.write(gender);
           fw.write("\t\t");
           
           System.out.println("Enter PhoneNumber: ");
           String pn = input.nextLine(); 
           fw.write(pn);
           fw.write("\t\t");
           
           
           System.out.println("Enter Address: ");
           String address = input.nextLine();
           fw.write(address);
           fw.write("\t\t");
           fw.close();
            break;
            
        
       }
         }while(choice2!=1 && choice2!=2 && choice2!=3 && choice2!=4 && choice2!=5 && choice2!=6);
          
        
        
      do{
        switch (choice2){
            case 2:
           Scanner  input = new Scanner (System.in);

           System.out.println("Enter New Id: ");
           String id =  input.nextLine();
           fw.write("ID \t\t FirstName \t\t LastName \t\t Gender \t\t PhoneNumber \t\t Address");
           fw.write(System.lineSeparator());
           fw.write(id);
           fw.write("\t");
           
           System.out.println ("Enter New FirstName: ");
           String fname = input.nextLine();
           fw.write(fname);
           fw.write("\t\tc");
           
           System.out.println ("Enter New LastName: ");
           String lname = input.nextLine();
           fw.write(lname);
           fw.write("\t\t");
           
           System.out.println ("Enter New Gender M/F: ");
           String gender = input.nextLine(); 
           fw.write(gender);
           fw.write("\t\t");
           
           System.out.println("Enter New PhoneNumber: ");
           String pn = input.nextLine();
           fw.write(pn);
           fw.write("\t\t");
           
           System.out.println("Enter New Address: ");
           String address = input.nextLine();
           fw.write(address);
           fw.write("\t\t");
           fw.close();
           break;
           
          
       }
         }while(choice2!=1 && choice2!=2 && choice2!=3 && choice2!=4 && choice2!=5 && choice2!=6);
          
           
        do{
         switch (choice2){
             case 3:
         
       
       }
           
         } while(choice2!=1 && choice2!=2 && choice2!=3 && choice2!=4 && choice2!=5 && choice2!=6);
         
           do{
         switch (choice2){
             case 4:
        
       }
           
         } while(choice2!=1 && choice2!=2 && choice2!=3 && choice2!=4 && choice2!=5 && choice2!=6);
           
           do{
         switch (choice2){
             case 5:
        
       }
           
         } while(choice2!=1 && choice2!=2 && choice2!=3 && choice2!=4 && choice2!=5 && choice2!=6);
       
           
            do{
         switch (choice2){
             case 6:
                 FileInputStream fa =  new FileInputStream ("Student.txt");
                 FileInputStreamReader fa = new FileInputStream (InputStream in);
                  Scanner inp = new Scanner (fa);
                  while (inp.hasNext()){
                      System.out.println(inp.nextLine());
                      break;
                      
                  }
        
       }
           
         } while(choice2!=1 && choice2!=2 && choice2!=3 && choice2!=4 && choice2!=5 && choice2!=6);
           
             do{
         switch (choice2){
             case 7:
        
       }
           
         } while(choice2!=1 && choice2!=2 && choice2!=3 && choice2!=4 && choice2!=5 && choice2!=6);
          
           
              do{
         switch (choice2){
             case 8:
        s.module ();
          
           break;
          
       }
        
         } while(choice2!=1 && choice2!=2 && choice2!=3 && choice2!=4 && choice2!=5 && choice2!=6);
      
          do{
         switch (choice2){
             case 9:
           s.Rmodule();
          
           break;
       }
        
         } while(choice2!=1 && choice2!=2 && choice2!=3 && choice2!=4 && choice2!=5 && choice2!=6);      
     
        do{
         switch (choice2){
             case 10:
   
          
           break;
       }
        
         } while(choice2!=1 && choice2!=2 && choice2!=3 && choice2!=4 && choice2!=5 && choice2!=6);
        break;
            case 2:
           
           t.dept();
           
          
          System.out.println("Welcome to Teacher Information");
          System.out.println("Please choose in the ff:");
          System.out.println("================================================");
          System.out.println("| 1.Add Teacher                                 |");
          System.out.println("| 2.Update Teacher                              |");
          System.out.println("| 3.Delete Teacher                              |");
          System.out.println("| 4.Calculate salary of a Teacher               |");
          System.out.println("| 5.Show all Teachers                           |");
          System.out.println("| 0.Exit                                        |");
          System.out.println("================================================");
          
        int choice3 = in.nextInt();
        do{
        switch(choice3){
            case 1:
          Scanner  input = new Scanner (System.in);
          
           System.out.println("Enter Id: ");
           String id =  input.nextLine();
           tw.write("ID \t\t FirstName \t\t LastName \t\t Gender \t\t PhoneNumber \t\t Address");
           tw.write(System.lineSeparator());
           tw.write(id);
           tw.write("\t");
           
           System.out.println ("Enter FirstName: ");
           String fname = input.nextLine();
          
           tw.write(System.lineSeparator());
           tw.write(id);
           tw.write("\t");
           
           System.out.println ("Enter LastName: ");
           String lname = input.nextLine();
          
           tw.write(System.lineSeparator());
           tw.write(id);
           tw.write("\t");
           
           System.out.println ("Enter Gender: ");
           char gender= input.next ().charAt(0);
           
           tw.write(System.lineSeparator());
           tw.write(id);
           tw.write("\t");
           
           System.out.println("Enter PhoneNumber: ");
           String pn = input.nextLine();
           
           tw.write(System.lineSeparator());
           tw.write(id);
           tw.write("\t");
           
           System.out.println("Enter Address: ");
           String address = input.nextLine();
          
           tw.write(System.lineSeparator());
           tw.write(id);
           tw.write("\t");
           break;
        
        }
        do{
         switch (choice3){
             case 4:
           t.THours();
          
           break;
       }
        
         } while(choice3!=1 && choice3!=2 && choice3!=3 && choice3!=4 && choice3!=5);      
     
        }while(choice3!=1 && choice3!=2 && choice3!=3 && choice3!=4 && choice3!=5 && choice3!=6);
           break;
       
        }
        }while(choice !=0);
        System.out.println("Thank you for using our program");
        
    }
   
    public static void deleteRecord(String f, String s) {
       
    
    
    
    }
    }   


