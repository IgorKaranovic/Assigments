package assignments14_OOP;

public class ParkingMeter {
	
			/*Question-6
		
		Write a class named ParkingMeter containing:
		Two instance variables named timeLeft and maxTime of type int. 
		The value of timeLeft should be initialized to 0.
		A constructor accepting a single integer parameter 
		whose value is used to initialize the maxTime instance variable.
		A method named add that accepts an integer parameter. 
		If the value of the parameter is equal to 25, 
		the value of timeLeft is increased by 30; otherwise, no increase is performed. 
		Furthermore, the increase occurs only if the value of timeLeft 
		will not exceed the value of maxTime. add returns a boolean value: 
		true if timeLeft was increased, false otherwise.
		A method named tick that accepts no parameters and returns no value. 
		tick decreases the value of timeLeft by 1, 
		but only if the value of timeLeft is greater than 0.
		A method named isExpired that accepts no parameters. 
		isExpired returns a boolean value: true if the value of timeLeft is equal to 0; 
		false otherwise.
		*/
	
	int timeLeft=0;
	int maxTime;
	
	public ParkingMeter(int maxTime) {
		this.maxTime=maxTime;
	}
	
	/*Furthermore, the increase occurs only if the value of timeLeft 
		will not exceed the value of maxTime. add returns a boolean value: 
		true if timeLeft was increased, false otherwise.*/
	public Boolean Add(int a) {
		
		Boolean b=true;
		
		if(a==25 && timeLeft<maxTime) {
			 timeLeft+=30;
				b=true;
		}else {
			b=false;
		}
		return b;
	}
	
	/*A method named tick that accepts no parameters and returns no value. 
		tick decreases the value of timeLeft by 1, 
		but only if the value of timeLeft is greater than 0.*/
	
	public void tick() {
		
		if(timeLeft>0) {
			timeLeft--;
		}
	}
	
	/*A method named isExpired that accepts no parameters. 
		isExpired returns a boolean value: true if the value of timeLeft is equal to 0; 
		false otherwise.*/
	public Boolean isExpired() {
		if(timeLeft==0) {
			return true;
		}else {
			return false;
		}
	}
	
}
