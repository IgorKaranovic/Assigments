package assignments3;

public class Question1 {
		/*Question-1

		Write a program to convert gallons into Liters and display it.

        Sample output:

       	15 gallon is 56.7812 liter*/
	
	
	public static void main(String[] args) {
		
		double litersPerGallon;
		litersPerGallon=3.7854;
		int gallon=15;
		double total= litersPerGallon*gallon;
		System.out.println(gallon + " gallons is " + total + " liter");
		
	}

}
