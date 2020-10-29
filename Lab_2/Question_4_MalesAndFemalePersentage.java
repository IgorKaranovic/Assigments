package Day19_StringManipulation_Part1.Lab_2;

import java.util.Scanner;

public class Question_4_MalesAndFemalePersentage {
	
	/*Question-4
	Write a program that asks user for the number of males and the number of females registered in a class. 
	The program should display the percentage of males and females in the class.*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numberOfMales;
		int numberOfFemales;
		
		System.out.println("How many males are in class?: ");
		numberOfMales=scan.nextInt();
		
		System.out.println("How many females are in class?: ");
		numberOfFemales=scan.nextInt();
		
		int total= numberOfMales + numberOfFemales;
		double persentageOfMales=(numberOfMales/(double) total)*100;
		double persentageOfFemales=(numberOfFemales/(double)total)*100;
		
		System.out.println("There are " + persentageOfMales+ " % of males and " + persentageOfFemales + " % of females in class");
	}
}
