package assignments14_OOP;

public class GasTank {
	
			/*Question-7
		
		Write a class named GasTank containing:
		An instance variable named amount of type double, initialized to 0.
		An instance variable named capacity of type double.
		A constructor that accepts a parameter of type double. 
		The value of the parameter is used to initialize the value of capacity.
		A method named addGas that accepts a parameter of type double. 
		The value of the amount instance variable is increased by the value of the parameter. 
		However, if the value of amount is increased beyond the value of capacity, 
		amount is set to capacity.
		A method named useGas that accepts a parameter of type double. 
		The value of the amount instance variable is decreased by the value 
		of the parameter. However, if the value of amount is decreased below 0, 
		amount is set to 0.
		A method named isEmpty that accepts no parameters. 
		isEmpty returns a boolean value: true if the value of amount is less than 0.1,
		 and false otherwise.
		A method named isFull that accepts no parameters. 
		isFull returns a boolean value: true if the value of amount is greater than 
		capacity-0.1, and false otherwise.
		A method named getGasLevel that accepts no parameters. 
		getGasLevel returns the value of the amount instance variable.
		A method named fillUp that accepts no parameters. 
		fillUp increases amount to capacity and returns the difference between the value 
		of capacity and the original value of amount 
		(that is, the amount of gas that is needed to fill the tank to capacity).
		*/
	
	
		Double amount = 0.0;
		Double capacity;
	
		
		public GasTank(Double a) {
			this.capacity=a;
		}
	
		public void addGas(Double b) {
			amount+=b;
			/*However, if the value of amount is increased beyond the value of capacity, 
			amount is set to capacity.*/
			if(amount>capacity) {
				amount=capacity;
			}
		}
		/*
		A method named useGas that accepts a parameter of type double. 
		The value of the amount instance variable is decreased by the value 
		of the parameter. However, if the value of amount is decreased below 0, 
		amount is set to 0.*/
		
		public void useGas(Double c) {
			amount-=c;
			
			if(amount<0) {
				amount=0.0;
			}
		}
		
		/*A method named isEmpty that accepts no parameters. 
		isEmpty returns a boolean value: true if the value of amount is less than 0.1,
		 and false otherwise.*/
	
		public Boolean isEmpty() {
			if(amount<0.1) {
				return true;
			}else {
				return false;
			}
		}
	
		/*A method named isFull that accepts no parameters. 
		isFull returns a boolean value: true if the value of amount is greater than 
		capacity-0.1, and false otherwise.*/
		
		public Boolean isFull() {
			if(amount>capacity-0.1) {
				return true;
			}else {
				return false;
			}
		}
		
		/*A method named getGasLevel that accepts no parameters. 
		getGasLevel returns the value of the amount instance variable.*/
		
		
		public Double getGasLevel() {
			
			return amount;
		}
		/*
		A method named fillUp that accepts no parameters. 
		fillUp increases amount to capacity and returns the difference between the value 
		of capacity and the original value of amount 
		(that is, the amount of gas that is needed to fill the tank to capacity).
		*/
		
		public Double fillUp() {
			Double originalAmount=capacity-amount;
			amount=capacity;
			
			return originalAmount;
		}
		
		
		
		
		
		
		
	
	
}

