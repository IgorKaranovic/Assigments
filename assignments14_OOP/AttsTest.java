package assignments14_OOP;

public class AttsTest {
	
	public static void main(String[] args) {
		
		Atts a = new Atts();
		
		a.name = "table";
		a.color = "brown";
		a.amount = 1;
		
		System.out.println(a.asString());
		
	}

}
