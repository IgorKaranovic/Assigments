package Day19_StringManipulation_Part1.Lab_2;

import java.util.Scanner;

public class Question_6_Tax {
	
	/*Question-6
	Write a program that will ask the user to enter the amount of a purchase. 
	The program should then compute the state and county tax sales tax. 
	Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
	The program should display the amount of the purchase , 
	the state sales tax, the county sales tax, the total sales tax, and the total of the sale 
	(which is the sum of the amount of purchase plus the total sales tax)*/
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the amount of a purchase:");
		
		int purchaseAmount = scan.nextInt();
				
		double Statesalestaxpercentage = 0.04;
		double countysalestaxpercentage =0.02;
		double statesalestax = purchaseAmount * Statesalestaxpercentage;
		double countysalestax = purchaseAmount * countysalestaxpercentage;
		double Totalsalestax =  statesalestax + countysalestax;
		double Totalofthesale = purchaseAmount + Totalsalestax;
				
		System.out.println("The amount of the purchase:"+purchaseAmount);
		System.out.println("The state sales tax:"+statesalestax);
		System.out.println("The county sales tax:"+countysalestax);
		System.out.println("The total sales tax:"+Totalsalestax);
		System.out.println("The total of the sale:"+Totalofthesale);
	}
}
