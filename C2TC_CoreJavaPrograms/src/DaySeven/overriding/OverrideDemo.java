package DaySeven.overriding;

public class OverrideDemo {
	public static void main(String[] args) {
		//Late binding,dynamic binding, runtime polymorphism
		//base class
		PLTraining p1=new PLTraining();
		p1.session("Full stack developer");
		
		//JFS object
		p1=new JFS();
		p1.session("Method overriding");
		
		//Python object
		p1=new Python();
		p1.session("Method overriding");
	}

}
