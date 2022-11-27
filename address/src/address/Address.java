
package address;

import java.util.Scanner;

public class Address {

public static Scanner input = new Scanner(System.in);
public static String AddressBook[][] = new String[100][4];
public static int ctr;
    public static void main(String[] args) {
        String ch = null;
        do{
        System.out.println("[1] Add Entry\n[2]Delete Entry\n[3]view all entries\n[4]Update Entry\n[0]Exit");
        System.out.print("Choose: ");
        ch = input.nextLine();
        switch(ch){
            case"1":
                System.out.println("You choose add");
                add();
                break;
            case"2":
                System.out.println("You choose delete");
                del();
                break;
            case"3":
                System.out.println("View");
                view();
                break;
            case"4":
                System.out.println("You choose update");
                update();
                break;
            case"0":
                System.out.println("Bye");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        
        }while(!("0".equals(ch)));
    }
    public static void add(){
        String temp[] = new String[4];
        System.out.print("Name: ");
        temp[0] = input.nextLine();
        System.out.print("Address: ");
        temp[1]  = input.nextLine();
        System.out.print("Number: ");
        temp[2] = input.nextLine();
        System.out.print("Email: ");
        temp[3] = input.nextLine();
        for (int i =0; i<4;i++){
            AddressBook[ctr][i] = temp[i];
        }
        ctr++; 
    }
    public static void del() {
        String name;
        System.out.println("Enter name to delete");
        name = input.nextLine();
        for (int i = 0; i<ctr;i++){
            if (AddressBook[i][0].equals(name)){
                for (int j = 0;j<4;j++){
                    AddressBook[i][j]=null;
                }
            }else{
                System.out.println("record not deleted");
            }
        }
        
    }
    public static void view(){
        for(int i = 0; i<ctr;i++){
            if (null!=AddressBook[i][0]){
                for(int j = 0; j<4; j++){
                    System.out.print(AddressBook[i][j]);
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }
        
    }
    public static void update(){
        String name,ch,change;int ind=0;
        System.out.println("Enter name to update");
        name = input.nextLine();
        System.out.println("[1] Name\n[2]Address\n[3]Telephone\n[4]Email");
        System.out.print("Choose: ");
        ch = input.nextLine();
        switch(ch){
            case"1":
                ind=0;
                break;
            case"2":
                ind=1;
                break;
            case"3":
                ind=2;
                break;
            case"4":
                ind=3;
                break;
            default:break;
        }
        System.out.println("What do you want to change it to?");
        change = input.nextLine();
        
        for (int i = 0; i<ctr;i++){
            if (AddressBook[i][0].equals(name)){
                    AddressBook[i][ind]=change;
            }else{
                System.out.println("record not updated");
            }
        }
    }
    
}
