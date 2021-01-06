package assignments14_OOP;

public class ColorTest {
	
	/** Ex:
	 * Color color = new Color();     
	 * * System.out.println(color.toString() ) ; // prints "white"     
	 * * Color color = new Color(255, 0, 0);     
	 * * System.out.println(color.toString() ) ; // prints "red"     
	 * * Color color4 = new Color(192, 192, 192);        
	 *   System.out.println(color4 ) ; // prints "light gray"  
	 * */
	
	public static void main(String[] args) {
		
		Color color = new Color();
		System.out.println(color.toString());
		
		
		Color color1 = new Color(255, 0, 0);     
		System.out.println(color1.toString() ) ;
		
		  
		Color color4 = new Color(192, 192, 192); 
		System.out.println(color4.toString()); 
	}
	

}
