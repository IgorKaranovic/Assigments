package assignments5_Forloop;

public class Question11 {
//		Question-11:
//		Print the following output using nested for loops.
//
//		4       3       2      1
//
//		     3       2      1
//
//		         2       1
//
//		              1
		
		public static void main(String[] args) {
			
			int n=4;
			
			int m=n; 
			for(int i=1; i<=n;i++) {	
				
				for(int x=1; x<i;x++) 	{ 
					System.out.print("  "); 
					}     
				for(int j=m; j>=1; j--) { 
					System.out.print(j + "   ");
					} 
				
				System.out.println();  
				m--;     			   
			}
		}
		
		
				
		}

