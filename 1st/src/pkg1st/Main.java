
package pkg1st;

import java.util.Scanner;

public class Main { //classs

    public static void main(String[] args) {// method (its a member of the class called main)
        String easy ="easier boii"; //easier to creat a string
        System.out.println("What is your name?");
        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
        System.out.println("hello "+b);
        System.out.println(easy);
        
        int e=2;
        int s=3;
        e+=s;
        System.out.println("2+3= "+ e );
        
        
    }
}

//class - contains everything and has members
//examples of members are methods (they do the things)
//properties - store something
//access modifyer (public/private) -who can use the members
//static - no instance of class is needed
//object - instance of a class