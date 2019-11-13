import java.util.Scanner;
/**
 *
 * @author Kacper
 */
public class project3 {
    public static double price(int x){
        Scanner inmethod = new Scanner(System.in);
        double cost = 0;
    int amount;
        if(x == 1){
         System.out.println("Please enter how much Milk you would like");
         amount = inmethod.nextInt();
         cost = amount * 1.5;
         return cost;
     }
         if(x == 2){
         System.out.println("Please enter how much Jam you would like");
         amount = inmethod.nextInt();
         cost = amount;
         return cost;
     }
          if(x == 3){
         System.out.println("Please enter how much Cheese you would like");
         amount = inmethod.nextInt();
         cost = amount * 1.2;
         return cost;
     }
           if(x == 4){
         System.out.println("Please enter how much Ham you would like");
         amount = inmethod.nextInt();
         cost = amount * 1.7;
         return cost;
     }
           return cost;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float total = 0;
        int amount;
        int yes;
        System.out.println("The Products available are:");
        System.out.println("1)Milk - £1.50");
        System.out.println("2)Jam - £1");
        System.out.println("3)Cheese - £1.20");
        System.out.println("4)Ham - £1.70");
        do{
        System.out.println("What product would you like to buy? Type 1-4 for the products");
        int choose = input.nextInt();
        if(choose == 1){
           total += price(1);
        }
        if(choose == 2){
           total += price(2);
        }
        if(choose == 3){
           total += price(3);
        }
        if(choose == 4){
           total += price(4);
        }
        System.out.println("Would you like to continue? 1 to continue, 2 to stop.");
         yes = input.nextInt();       
        }while(yes == 1);
         System.out.println("Your total come out to :£" + total);
        }
           
 
}
   
