package assignments5_Forloop;

public class Question14 {
	
//		Question-14:
//		Write nested loop to draw this pattern
//		##
//		# #
//		#  #
//		#   #
//		#    #
//		#     #
//		#      #
	
			public static void main(String[] args) {
				
				for(int i=0; i<=6; i++) {
					for(int x=0;x<1;x++) {
						System.out.print("#");
					for(int j=0; j<i; j++) {
						System.out.print(" ");
						}
					}
					System.out.println("#");
				}
		}

				
			}

