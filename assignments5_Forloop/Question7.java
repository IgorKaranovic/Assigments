package assignments5_Forloop;

public class Question7 {
//		Question-7:
//		Write a Java program to print all the numbers,
//		between 1 and 100, (including 1 and 100),
//		which are divisible by 5.
			
		public static void main(String[] args) {
				
			
			for(int num=1;num<=100;num++) {
				
				if(num%5==0) {
					System.out.println(num);
				}
			}
			
			
			}

}
