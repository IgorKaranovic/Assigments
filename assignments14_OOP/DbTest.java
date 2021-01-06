package assignments14_OOP;

public class DbTest {
	
	public static void main(String[] args) {
		
		Db db = new Db();
		
		db.insertData("aaa", 123);
		
		System.out.println(db.getData());
		System.out.println(db.getYint());
		
		db.setData("zzz");
		db.setYint(200);
		
		System.out.println(db.getData());
		System.out.println(db.getYint());
	}

}
