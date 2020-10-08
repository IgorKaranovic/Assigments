package assignments5_Forloop;

import java.util.Scanner;

public class Question6 {
	
//		Question-6:
//		Write a program to print Fibonacci series of n terms, 
//		where n is declared by user :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
	
	
	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			int n=scan.nextInt();
			int t1=0;
			int t2=1;
			int sum=t1+t2;
			System.out.print(t1);
			
			for(int i=1;i<n;++i) {
				System.out.print(", " + sum);
				
				sum=t1+t2;
				t1=t2;
				t2=sum;
			}
			
	}

}
