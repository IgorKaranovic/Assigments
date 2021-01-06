package assignments14_OOP;

public class LameCalculatorTest {
	
	public static void main(String[] args) {
		
		LameCalculator lc = new LameCalculator();
		
		lc.plus(1, 1);
		lc.minus(1, 1);
		lc.multiply(2, 1);
		lc.divide(10, 2);
		
		System.out.println(lc.plus(1, 1));
		System.out.println(lc.minus(1, 1));
		System.out.println(lc.multiply(2, 1));
		System.out.println(lc.divide(10, 2));
		
	}
	

}
