package Day19_StringManipulation_Part1.Lab_2;

import java.util.Scanner;

public class Question_3_SumOfnumbers {
	
	/*Question-3
	Write a program that asks the user for a positive nonzero integer value. 
	The program should use a loop to get the sum of all the integers from 1 up to the number entered.*/ 
	
	public static void main(String[] args) {
		  
		  Scanner scan=new Scanner(System.in);
	      System.out.print("Enter positive nonzero integer number:");
		  int sum=0;
	      int num=scan.nextInt();
	      
	      for (int i=1; i<=num; i++) {
	    	  sum+=i;
	      }
	      System.out.println("Sum of integers: "+sum);
	
		
	}
}
