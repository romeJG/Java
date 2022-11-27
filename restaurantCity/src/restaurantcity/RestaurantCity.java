
package restaurantcity;

import java.util.Scanner;


public class RestaurantCity {
    
    static Scanner input = new Scanner(System.in);
    static String[][] items = new String[100][2];
    static String[][] orders = new String[100][3];
    static int orderCtr = 0;
    static int itemCtr = 0; 
    public static void main(String[] args) {
        String ch;
        do{
            System.out.println("[1]Order"
                             + "\n[2]Menu Items"
                             + "\n[0]Exit");
            ch = input.nextLine();
            
            switch(ch){
                case "1":
                    System.out.println("You choose option order");
                    order();
                    break;
                case "2":
                    System.out.println("you choose option menu");
                    menuItems();
                    break;
                case"0":
                    System.out.println("bye.");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            
        }while(!"0".equals(ch));
    }   
    
    
    public static void order(){
        String ch;
        do{
            System.out.println("[1] add order\n" +
                               "[2] remove order\n" +
                               "[3] see all order\n" +
                               "[0] back");
            ch = input.nextLine();
            
            switch(ch){
                case "1":
                    addOrder();
                    break;
                case "2":
                    removeOrder();
                    break;
                case "3":
                    seeOrder();
                    break;
                case"0":
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            
        }while(!"0".equals(ch));
    }
    public static void seeOrder() {
        System.out.println("Order Number    Orders");
        for(int i = 0; i<orderCtr;i++){
            System.out.print(i);
            System.out.print("          ");
            System.out.println(orders[i][0]);
        }
    }
    
    public static void removeOrder(){
        seeOrder();
        System.out.print("Enter the order number to remove: ");
        int num = input.nextInt();
        for (int i=0; i<orderCtr;i++){//removes the animal that the user entered
            if(i==num){
                for(int j=i;j<orderCtr;j++){
                    orders[orderCtr][0]=orders[orderCtr+1][0];
                }
                orderCtr-=1;
                System.out.println("item removed!");
            }
        }
    }
    
    public static void addOrder(){
        seeMenu();
        Boolean pass = true;
        String inp;
        int tot = 0;
        int orderc = 0;
        
        System.out.print("Choose your Order:");
        String order = input.nextLine();
        System.out.print("How Many ?");
        String hm = input.nextLine();
        System.out.println(itemCtr);
        orders[orderCtr][0] = order;
            
        System.out.println("Your order Number"+orderCtr);
        orderCtr+=1;
    }
    public static void seeMenu(){
        System.out.println("Item name                   Item Price");
        for(int i = 0; i<itemCtr;i++){
            System.out.println(items[i][0]+"                P"+items[i][1]);
        }
        
    }
    
    
    public static void addMenuItem(){
        System.out.print("Food Name: ");
        String name = input.nextLine();
        System.out.print("Food Price: ");
        Double price = input.nextDouble();
        items[itemCtr][0] = name;
        items[itemCtr][1] = String.valueOf(price);
        itemCtr+=1;
        System.out.println("Item added in The Menu");
    }
    public static void removeItem(){
        seeMenu();
        System.out.print("Enter the name to remove: ");
        String name = input.nextLine();
        for (int i=0; i<itemCtr;i++){//removes the animal that the user entered
            if(name==items[i][0]){
                for(int j=i;j<itemCtr;j++){
                    items[itemCtr][0]=items[itemCtr+1][0];
                    items[itemCtr][1]=items[itemCtr+1][1];
                }
                itemCtr-=1;
            }
        }
        System.out.println("item removed!");
    }
    
    public static void menuItems(){
        String ch;
        do{
            System.out.println("[1]add items to menu"
                             + "\n[2]remove item to menu"
                             + "\n[3]see menuItems"
                             + "\n[0]back");
            ch = input.nextLine();
            
            switch(ch){
                case "1":
                    addMenuItem();
                    break;
                case "2":
                    removeItem();
                    break;
                case "3":
                    seeMenu();
                    break;
                case"0":
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            
        }while(!"0".equals(ch));
    }

    
}
