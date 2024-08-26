package ex04_다형성;

public class 진도개 extends Dog {

	public 진도개() {}
	
	@Override
	void speak() {				//반드시 재정의 필요함!!!!
		System.out.println("왈왈~!");
		}
	
	void func2() {}
}


