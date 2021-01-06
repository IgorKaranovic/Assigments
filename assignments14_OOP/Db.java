package assignments14_OOP;

public class Db {
	
	/*Question-3

	In Db class we have two attributes/instance variables with the private visibility. 
	Meaning they cannot be accessed outside of the class.
	
	Instance variables:
	1) name: data -
	type: String
	Visibility/Access modifier: private
	2) name: int -
	type: int
	Visibility/Access modifier: private
	
	Methods:
	- insertData - lets you set the values to above encapsulated instance variables.
	- getData - getter method for private data
	- getYint - getter method for private yint
	- setData - setter method for private data
	- setYint - setter method for private yint
	
	 
	
	for example
	
	Db db = new Db();
	db.insertData("aaa",123);
	
	System.out.println(db.getData());//aaa
	System.out.println(db.getYint());//123
	
	db.setData("zzz");
	db.setYint(200);
	
	System.out.println(db.getData());//zzz
	System.out.println(db.getYint());//200
	*/

	private String Data;
	private int Yint;
	
	
	public void insertData(String Data, int Yint) {
		this.Data = Data;
		this.Yint = Yint;
	}
	
	
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public int getYint() {
		return Yint;
	}
	public void setYint(int yint) {
		Yint = yint;
	}
	
	
}
