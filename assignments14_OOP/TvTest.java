package assignments14_OOP;

public class TvTest {
	
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		
		tv.setVolumeLevel(5);
		
		System.out.println(tv.getVolumeLevel());
		
		System.out.println(tv.on);
		
		tv.turnOn();
		
		System.out.println(tv.on);
		
		tv.setVolumeLevel(5);
		
		System.out.println(tv.getVolumeLevel());
		
		tv.turnOff();
		
		tv.turnOff();
		
		tv.turnOn();
		
		tv.turnOn();
	}

}
