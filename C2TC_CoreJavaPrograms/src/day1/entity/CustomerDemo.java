package day1.entity;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Usual class and object
		
		Customer a1 = new Customer();
		a1.aid = 101;
		a1.aname = "Adithyan";
		a1.acity = "Puducherry";
		System.out.println("Customer id:"+a1.aid);
		System.out.println("Customer name:"+a1.aname);
		System.out.println("Customer city:"+a1.acity);
		
		System.out.println();
		
		Customer a2 = new Customer();
		a2.aid = 102;
		a2.aname = "Abineshwar";
		a2.acity = "Puducherry";
		System.out.println("Customer id:"+a2.aid);
		System.out.println("Customer name:"+a2.aname);
		System.out.println("Customer city:"+a2.acity);

		System.out.println("*************");
		
		//Using Getter and Setter
		
		Customer c3 = new Customer();
		c3.setCid(103);
		c3.setCity("Harish");
		c3.setCname("Puducherry");
		System.out.println("Customer id:"+c3.getCid());
		System.out.println("Customer name:"+c3.getCname());
		System.out.println("Customer city:"+c3.getCity());
		
		System.out.println("**************");
		
		//Using ToString

		Customer c4 = new Customer();
		c4.setCid(104);
		c4.setCity("Sahal");
		c4.setCname("Puducherry");
		System.out.println(c4);
	}

}
