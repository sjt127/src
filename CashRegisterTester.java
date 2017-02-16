/**
 * Stephen Thomas
   Add generic header here
   This class tests the CashRegister class.
*/
public class CashRegisterTester
{
   public static void main(String[] args)
   {
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
      System.out.println("Expected Change: ??");
      
      //Add 2 - more test cases that shows expected and actual values
      
      userInputSimulator();
   }
   
   public static void userInputSimulator()
   {

	  //Use scanner to get input for food item/non food item and payment 
	   
      CashRegister register = new CashRegister();

      System.out.print("Enter food item price: ");


      System.out.print("Enter dollars: ");
      System.out.print("Enter quarters: ");
      System.out.print("Enter dimes: ");
      System.out.print("Enter nickels: ");
      System.out.print("Enter pennies: ");

      System.out.print("Your change: ");
      System.out.println(register.giveChange());
   }

}

