package assignments14_OOP;

public class Value {
	
	/*Question-8
	
	Write a class definition of a class named 'Value' with the following:
	a constructor accepting a single integer parameter
	a constructor with no parameters
	a method 'setVal' that accepts a single parameter,
	a boolean method, 'wasModified' that returns true if setVal was ever called 
	for the object.
	a method 'getVal' that returns an integer value as follows: 
	if setVal has ever been called, it getVal returns the last value passed to setVal. 
	Otherwise if the "single int parameter" constructor was used to create the object, 
	getVal returns the value passed to that constructor. Otherwise getVal returns 0.
	*/
	
	public Value(int a) {
		getVal(a);
	}
	
	public Value() {
		getVal(0);
	}
	
	public void setVal(int Val) {
		wasModified();
		getVal(Val);
	}
	
	public int getVal(int Val) {
		System.out.println(Val);
		return Val;
	}
	
	
	public Boolean wasModified() {
		return true;
	}
}
