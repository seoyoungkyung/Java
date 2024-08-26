package ex07;

public class ClassB extends ClassA{

	private int b;
	
	public ClassB() {}
	
	public ClassB (int b) {
		//super(0);  -->classA에 기본생성자가 없을 경우 입력해줘야함.
		this.b = b;
	}
	public ClassB(int a,int b) {
		super(a);
		this.b = b;
		
	}
	@Override
	void info() {
		super.info();
		System.out.println(b);
	}
	
	//getter -> int b -> int getB(){return b;}
}
