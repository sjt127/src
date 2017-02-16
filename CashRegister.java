/**
 * Stephen Thomas
   A cash register totals up sales, calculate tax and computes change due.
 */
public class CashRegister
{
	//constants always have to be capital
	//if they were part of local method they would be 
	//final double QUARTER_VALUE = .25; eg. main method
	public static final double QUARTER_VALUE = 0.25;
	public static final double DIME_VALUE = 0.1;
	public static final double NICKEL_VALUE = 0.05;
	public static final double PENNY_VALUE = 0.01;

	private double purchase;
	private double payment;
	
	public static final double Food_Tax = .07;
	public static final double Non_Food_Tax = .10;

	//Add constants to store food tax and non food tax rate
	
	/**
      Constructs a cash register with no money in it.
	 */

	public CashRegister()
	{
		
	}//CashRegister

	public CashRegister(double purchase, double payment){

	}//CashRegister

	public CashRegister(double purchase){

	}//CashRegister


	/**
      Records the purchase price of a food item.
      @param amount the price of the purchased item
	 */
	public void recordFoodPurchase(double amount)
	{
		//Grade - 5 Points
	}

	/**
   Records the purchase price of a non-food item.
   @param amount the price of the purchased item
	 */

	public void recordNonFoodPurchase(double amount){

	}

	/**
      Enters the payment received from the customer.
      @param dollars the number of dollars in the payment
      @param quarters the number of quarters in the payment
      @param dimes the number of dimes in the payment
      @param nickels the number of nickels in the payment
      @param pennies the number of pennies in the payment
	 */
	public void enterPayment(int dollars, int quarters, 
			int dimes, int nickels, int pennies)
	{

	}

	/**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
	 */
	public double giveChange()
	{
		return 0;
	}
	/**
	 * Return total cost including tax
	 * @return the total cost for food, non-food item with tax
	 */
	public double getTotalCost() {
		return 0;
	}

}
