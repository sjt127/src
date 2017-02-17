import java.util.Scanner;

/**
 * Stephen Thomas
   Add generic header here
   This class tests the CashRegister class.
*/

public class CashRegisterTester{
   public static void main(String[] args){
	 
      CashRegister register = new CashRegister();

      System.out.println("Add Food Item cost: 0.75");
      register.recordFoodPurchase(0.75);
      System.out.println("Add Non-Food Item cost: 1.50");
      register.recordNonFoodPurchase(1.50);
      System.out.println("Payed 2 dollors, 0 quarters, 5 dimes, 0, nickels, 0 cents" );
      register.enterPayment(2, 0, 5, 0, 0);
      System.out.println("Total Purchase with Tax: " + register.getTotalCost());
      System.out.print("Change: ");
      System.out.println("Actual Change: " + register.giveChange());
      System.out.println("Expected Change: .05");
      
      //Add 2 - more test cases that shows expected and actual values
      userInputSimulator();
      userInputSimulator1();
      
   } 
   public static void userInputSimulator(){
//5.0825     8.9325 
	      CashRegister register = new CashRegister();
	      Scanner keyboard = new Scanner(System.in); 
	      char x = 'y';
	      int z = 0;
	      while(x == 'y'){
	    	  //Greet the customer
	    	  if (z == 0){
	    	  System.out.println("Hi How are you? Do you have a food item or non-food?");
	    	  z++;
	    	  }
	    	  //AFter the first time, ask user if they want to process more items 
	    	  if (z > 1){
	    		  System.out.println("Would you like to process more items?");
	    		  System.out.println("Enter y for yes and n for no");
	    		  x = keyboard.next().charAt(0);
	    		  if (x == 'n'){
	    			  break;
	    		  }
	    	  }
	    	  //Ask User for food item or non food
	    	  System.out.println("Click 1 for food and 2 for non food");
	    	  int foodvsnonfood = keyboard.nextInt();
	    	  //if food item then
	    	  if (foodvsnonfood == 1 && x != 'n'){
	    		  System.out.println("Enter the cost for the food item");
	    		  double food = keyboard.nextDouble();  
	    		  register.recordFoodPurchase(food);
	    	  }
	    	  //if nonfood item then
	    	  else if (foodvsnonfood == 2 && x != 'n'){
	    		  System.out.println("Enter the cost for the NON food item");
	    		  double nonfood = keyboard.nextDouble();
	    		  register.recordNonFoodPurchase(nonfood);
	    	  }
	    	  //proceed to payment 
	    	  else {
	    		  System.out.println("Proceeding to Payment...");
	    	  }
	    	  z++;
	      }
	      //total purchase
	      System.out.println("Total Purchase with Tax: " + register.getTotalCost());
	      
	      //ask for payment
	      System.out.println("Please enter the number of each denomination below ");
	      System.out.println("Dollars");
	      int dollars = keyboard.nextInt();
	      System.out.println("Quarters");
	      int quarters = keyboard.nextInt();
	      System.out.println("Dimes");
	      int dimes = keyboard.nextInt();
	      System.out.println("Nickels");
	      int nickels = keyboard.nextInt();
	      System.out.println("Pennies");
	      int pennies = keyboard.nextInt();
	      
	      register.enterPayment(dollars, quarters, dimes, nickels, pennies);
	      //change
	      System.out.println("Thank you for shopping with us today");
	      System.out.print("Change: " + register.giveChange());
	      
   }
   public static void userInputSimulator1(){
	      CashRegister register = new CashRegister();
	      Coin coins = new Coin();
	     
}
   }
