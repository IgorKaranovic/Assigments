package Day19_StringManipulation_Part1.Lab_2;

import java.util.Scanner;

public class Question_2_NumberOfCalories {
	/*Question-2
	A bag of cookies holds 40 cookies. 
	The calorie information on the bag claims that there are 10 serving in the bag 
	and that a serving equals 300 calories. 
	Write a program that lets the user enter the number of cookies he or she actually ate 
	and then reports the number of total calories consumed.*/
	
	public static void main(String[] args) {
		 
	    Scanner sc = new Scanner(System.in);
	 
	    System.out.print("Enter how many cookies you ate: ");
	 
	    int cookieCount = sc.nextInt();
	 
	    int servingSize = 40/10;
	    int caloriesPerCookie = 300/servingSize;
	    int totalCalories = cookieCount * caloriesPerCookie;
	 
	    System.out.println("Total calories consumed: " + totalCalories);
	  }

}
