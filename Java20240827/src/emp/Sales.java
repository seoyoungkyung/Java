package emp;

public class Sales extends Employee implements Bonus {

	public Sales() {}
	public Sales(String name,int number,String department,int salary) {
		super(name,number,department,salary);
	}
	
	public	double tax() {
		return salary*0.13;
	}
	
	double getExtraPay() {
		return salary*0.03;
	}
	
	@Override
	public void incentive(int pay) {
		double tmp = pay *1.2;
		salary += tmp;
	}
}
