package Day19_StringManipulation_Part1.Lab_2;

import java.util.Scanner;

public class Question_1_HighestAndLowestNuber {
	/*Write a program with a loop that lets the user enter a series of integer numbers. 
	  After all the numbers have been entered, the program should display the largest and smallest numbers entered.
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int answer=1;
	       int items=2;
	       int newnum =0 ;
	       int highest=0;
	       int lowest =0;

	       Scanner scan = new Scanner(System.in);
	       System.out.print("Enter your first number:");
	       newnum=scan.nextInt();
	       lowest=newnum;
	            
	           
	       for (int i=0; i<items; i++){
	    	   while(answer!=0){
	    	       System.out.print("Enter your next number:");
	    	       newnum=scan.nextInt(); 
	    	       items++;
	    	       System.out.print("Do you want to enter another number: 0-No, 1-Yes!");
	    	       answer = scan.nextInt();
	    	       }               
	           if (highest<newnum)
	               highest=newnum;

	           if (lowest==0)
	               lowest=newnum;

	           else if (newnum<=lowest)
	               lowest=newnum;
	       }
	       
	       
	       System.out.println("The highest number is "+highest);
	       System.out.println("The lowest number is "+lowest);
}
}
