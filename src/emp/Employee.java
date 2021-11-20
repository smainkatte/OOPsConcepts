package emp;

public class Employee {

	String name;
	Location location;
	double salary;
	int age;
	
	Employee(String name, Location location, int age, double salary){
		this.name = name;
		this.location = location;
		this.salary = salary;
		this.age = age;
	}
	
	void raiseSalary() {
		this.salary = this.salary * 1.2 ;
		System.out.println("Hey " + this.name + " , Youe raised salary is : " + this.salary );
	}
}
