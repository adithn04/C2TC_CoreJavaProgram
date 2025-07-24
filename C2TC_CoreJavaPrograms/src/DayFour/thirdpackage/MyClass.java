package DayFour.thirdpackage;

public class MyClass {
	public static MyClass obj=new MyClass(); //making this private, can't able to access PrivateConstructorDemo
	public int id;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	private MyClass() {
		System.out.println("MyClass object created");		
	}
	
	public static MyClass getObject() //factory method
	{
		return obj;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}

}
