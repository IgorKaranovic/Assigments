package assignments14_OOP;

public class SavingsAccount extends BankAccount{

	/*A double instance variable, interestRate.*/
	
	Double interestRate;
	
	
	/*A method getInterestRate that returns a value of interestRate.*/
	
	public Double getInterestRate() {
		
		return interestRate;
	}
	
	/*A constructor that accepts a parameter of type double which is used to 
	initialize the instance variable.*/
	
	public SavingsAccount(Double interestRate) {
		this.interestRate=interestRate;
	}
}
