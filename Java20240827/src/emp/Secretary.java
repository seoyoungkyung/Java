package emp;

public class Secretary extends Employee  implements Bonus {

	public Secretary() {}
	public Secretary(String name,int number,String department,int salary) {
		super(name,number,department,salary);
	}
	
	public double tax() {
		return salary*0.10;
	}
	
	@Override
	public void incentive(int pay) {
		double tmp = pay *0.8;
		salary += tmp;
		
	}
	

}
