package ex09;

public class ClassC extends ClassB{

	int num4;
	int num5;
	
	public  ClassC(int num1,int num2,int num3,int num4,int num5) {
		super(num1,num2,num3);
		this.num4 = num4;
		this.num5 = num5;
	}
	
	void info() {
		super.info();
		System.out.println(num4);
		System.out.println(num5);
	}
}
