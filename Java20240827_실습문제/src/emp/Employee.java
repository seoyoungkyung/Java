package emp;

public abstract class Employee{

	String name;
	int number;
	String department;
	int salary;
	
	public Employee() {}
	public Employee(String name,int number,String department,int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	public double tax() {
	return 0;
	}
	
}
