//Program to demonstrate static variables
package DaySix.staticvariable;

public class EmployeeDemo {

	public static void main(String[] args) {
		// Create the first object of the class and pass the two arguments with type
		//string and integer.
		System.out.println(Employee.companyName);
		Employee e = new Employee("Shubh", 123);
		System.out.println(e);
		//d
		// Similarly, create the second object of the class and pass the two arguments.
		e = new Employee("Deep", 321);
		System.out.println(e);
	}
}