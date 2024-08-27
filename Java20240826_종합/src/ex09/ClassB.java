package ex09;

public class ClassB extends ClassA {

	int num3;
	
	
	public  ClassB(int num1,int num2,int num3) {
		super(num1,num2);
		this.num3 = num3;
	}
	void info(){
		super.info();
		System.out.println(num3);
		}
	
}
