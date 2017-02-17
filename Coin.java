
public class Coin {


	private double value = 0;
	
	private double payment;
	
	public static final double penny = 0.01;
	public static final double two_penny = 0.02;
	public static final double five_penny = 0.05;
	public static final double ten_penny = 0.10;
	public static final double twenty_penny = 0.2;
	public static final double fifty_penny = 0.50;
	
	public Coin(){
	payment = 0;
	}
	
	public double getValue(){
		return value;
	}
	
	public void enterPayment(int euro, int penny_c, int two_penny_c,int  five_penny_c, int ten_penny_c, int twenty_penny_c, int fifty_penny_c){
		payment = (euro*1) + (penny_c*penny) + (two_penny_c*two_penny) + (five_penny_c*five_penny) + (ten_penny_c*ten_penny) + (twenty_penny_c*twenty_penny) + (fifty_penny_c*fifty_penny);
	}
	
}
