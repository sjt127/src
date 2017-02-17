/**
 * Stephen Thomas
 * A cash register totals up sales, calculate tax and computes change due.
 */
public class CashRegister{
	public static final double QUARTER_VALUE = 0.25;
	public static final double DIME_VALUE = 0.1;
	public static final double NICKEL_VALUE = 0.05;
	public static final double PENNY_VALUE = 0.01;

	private double purchase;
	private double payment;
	
	public static final double FOOD_TAX = .07;
	public static final double NON_FOOD_TAX = .10;

	
	/**
      Constructs a cash register with no money in it.
	 */

	public CashRegister(){
	}//CashRegister

	public CashRegister(double purchase, double payment){
		purchase = 0;
		payment = 0;
	}//CashRegister

	public CashRegister(double purchase){
		purchase = 0;
	}//CashRegister


	/**
      Records the purchase price of a food item.
      @param amount the price of the purchased item
	 */
	public void recordFoodPurchase(double amount){
		purchase = purchase + ((amount * FOOD_TAX) + amount);
	}

	/**
   Records the purchase price of a non-food item.
   @param amount the price of the purchased item
	 */

	public void recordNonFoodPurchase(double amount){
		purchase = purchase + ((amount * NON_FOOD_TAX) + amount);
	}
//sda
	/**
      Enters the payment received from the customer.
      @param dollars the number of dollars in the payment
      @param quarters the number of quarters in the payment
      @param dimes the number of dimes in the payment
      @param nickels the number of nickels in the payment
      @param pennies the number of pennies in the payment
	 */
	public void enterPayment(int dollars, int quarters,int  dimes, int nickels, int pennies){
		payment = (dollars*1) + (quarters*QUARTER_VALUE) + (dimes*DIME_VALUE) + (nickels*NICKEL_VALUE) + (pennies*PENNY_VALUE);
	}

	/**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
	 */
	public double giveChange()
	{
		double change = payment - purchase;
		payment = 0;
		purchase = 0;
		
		 Math.abs(change);
		 change = Math.round(change*100.0) / 100.0;
		 return change;
		
	}
	/**
	 * Return total cost including tax
	 * @return the total cost for food, non-food item with tax
	 */


	public double getTotalCost() {
		purchase = Math.round(purchase*100.0) / 100.0;
		return purchase;
	}



}
