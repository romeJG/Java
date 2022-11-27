
package zoo;
import java.util.Scanner; //scanner for input
public class Zoo {//class name
    
public static String animals[][]=new String[100][3];//	Contains: [0]Animal Type,[1]Name,[2]Age
public static int maxAnimals=0;//how many animals are in the zoo its public static so that all the functions can acess the variable

public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String ch;
        do{
            System.out.println("[1]Add Animal"
                             + "\n[2]Remove Animal"
                             + "\n[3]Feeding Time"
                             + "\n[0]Exit Program");
            
            ch = input.nextLine();
            
            switch(ch){
                case "1":
                    System.out.println("Add Animal!");
                    addAnimal();//calls the add animal function (see line 44)
                    break;
                case "2":
                    System.out.println("Remove Animal");
                    removeAnimal();//calls the remove animal function (see line 57)
                    break;
                case "3":
                    System.out.println("Feeding timee!!!!!");
                    feedingTime();//calls the feeding time function (see  75)
                    break;
                case"0":
                    System.out.println("bye.");//exits the program
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }while(!"0".equals(ch));//while ch is not equal to '0' the program will not end kasi sa case merong 1,2,3,0 then kapag 0 yung sagot ng user mag eexit program
    }
    
    public static void addAnimal(){
        System.out.print("what is the type? ");
        String animal = input.nextLine();
        System.out.print("what is the name? ");
        String name = input.nextLine();
        System.out.print("what is the age? ");
        String age = input.nextLine();
        animals[maxAnimals][0]=animal;//puts the animal type in to the [last place in the array]
        animals[maxAnimals][1]=name;//puts the animal name in to the [last place in the array]
        animals[maxAnimals][2]=age;//puts the animal age in to the [last place in the array]
        System.out.println(name+ " the " + animal+ " Has been added");
        maxAnimals+=1;//adds a animal in the animal counter
    }
    public static void removeAnimal(){
        System.out.println("list of animals");
        for (int i=0; i<maxAnimals;i++){    //this loop outputs the list of animals in the zoo
            System.out.println(animals[i][1]+" The "+animals[i][0]);
        }
        System.out.println("Enter the name to remove: ");
        String name = input.nextLine();
        for (int i=0; i<maxAnimals;i++){//removes the animal that the user entered
            if(name==animals[i][0]){
                for(int j=i;j<maxAnimals;j++){
                    animals[maxAnimals][0]=animals[maxAnimals+1][0];
                    animals[maxAnimals][1]=animals[maxAnimals+1][1];
                    animals[maxAnimals][2]=animals[maxAnimals+1][2];
                }
            }
        }
        System.out.println("Succesfully Removed "+name);//feedback
    }
    public static void feedingTime(){
        System.out.println("Choose the animal to feed");
        for (int i=0; i<maxAnimals;i++){//shows the list of the animals
            System.out.println(animals[i][1]+" The "+animals[i][0]);
        }
        String name = input.nextLine();
        System.out.println("its feeding time "+ name);//feeding time prompt
    }
}

