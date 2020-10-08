package assignments5_Forloop;

public class Question9 {
	
//		Question-9:
//		Write a program for the following logic:
//		Print all the odd numbers in comma-separated,
//		form from 1 till the end (you may change it):
//		if end = 10, OUTPUT = 1, 3, 5, 7, 9
//		if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11
//
//		You should use while loop and if-else statements. 
//		Note that, there should not be any comma after the last digit.
		
	
		public static void main(String[] args) {
			 
			int i=1;
			int end=10;
			
			while (i<=end) {
				
				if(i%2==1) {
					System.out.print(i);
					
				}else {
					System.out.print(", ");

				}
				i++;
				
			}
			
			
		}
}
