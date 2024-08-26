package ex07;

public class ClassC extends ClassB{

	private int c;
	
	public ClassC() {}
	
	public ClassC(int c) {
		this.c = c;
	}
	
	public ClassC(int a,int b,int c) {
		super(a,b);
		this.c=c;
	}
	@Override
	void info() {
		super.info();
		System.out.println(c);
	}
	//super 사용 x 시
	//system.out.println(getA()+" "+getB()+" "+c);
	
}
