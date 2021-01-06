package assignments14_OOP;

public class GasTankTest {
	
	public static void main(String[] args) {
		
		GasTank gs = new GasTank(100.0);
		
		gs.addGas(20.0);
		
		System.out.println(gs.amount);
		
		gs.useGas(20.0);
		
		System.out.println(gs.isEmpty());
		
		gs.addGas(90.0);
		
		System.out.println(gs.isFull());
		
		System.out.println(gs.getGasLevel());
		
		System.out.println(gs.fillUp());
		
		
		
		
		
		
	}
	
	
	
	

}
