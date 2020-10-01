package assignments3;

public class Question5 {
	/*Question-5

Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

-Declare int variables inputSeconds, hours, minutes, seconds
-Initialize the inputSeconds

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result

       Sample Output:

       inputSecond is 3695

      1 hours, 1 minutes, and 35 seconds*/
	
	public static void main(String[] args) {
		
		int inputSeconds, hours, minutes, seconds;
		
		inputSeconds=3695;
		
		hours= 3600;
		minutes=60;
		seconds=60;
		
		int total1=inputSeconds/hours;
		int total2=(inputSeconds%hours)/minutes;
		int total3=(inputSeconds%hours)%seconds;
		
		System.out.println("inputSeconds is " + inputSeconds);
		System.out.println(total1 + " hours" + " " +  total2 + " minutes" + " , and " + total3 + " seconds");
		
	}

}
