package assignments5_Forloop;

public class Question10 {
	
//		Question-10:
//		Print following output using nested for loops:
//		1
//		22
//		333
//		4444
//		55555
//		666666
//		7777777
	
	public static void main(String[] args) {
		
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
					
	}

}
