package assignments3;

public class Question4 {
		/*Question-4

		Declare 2 variables (Num1, Num2)

		Swap values between Num1 and Num2

		Display new values of Num1 and Num2

      	Sample output:

      	n1=10
      	n2=20

      	----------

      	n1=20
      	n2=10*/
	public static void main(String[] args) {
		
		int Num1,Num2;
		
		Num1=10;
		Num2=20;
		
		System.out.println("Before Swap");
		System.out.println("First number is " + Num1);
		System.out.println("Second number is " + Num2);
		
		int temporary=Num1;
		Num1=Num2;
		Num2=temporary;
		
		System.out.println("After Swap");
		System.out.println("First number is " + Num1);
		System.out.println("Second number is " + Num2);
		
		
	}

}
