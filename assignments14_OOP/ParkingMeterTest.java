package assignments14_OOP;

public class ParkingMeterTest {
	
	public static void main(String[] args) {
		
		ParkingMeter Pm = new ParkingMeter(20);
		
		System.out.println(Pm.Add(25));
		
		System.out.println(Pm.Add(20));
		
		System.out.println(Pm.timeLeft);
		
		Pm.tick();
		
		System.out.println(Pm.timeLeft);
		
		System.out.println(Pm.isExpired());
	}

}
