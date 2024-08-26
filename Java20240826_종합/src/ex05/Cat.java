package ex05;

public class Cat extends Animal{

	int age;
	
	public Cat() {}
	
	Cat(String name,int age){
		super(name);
		this.age = age;
	}
	
		@Override
		void info(){
				super.info();
				System.out.println(age+"살 입니다.");
			}
		@Override
		void speak() {						//반드시 재정의 필요함!!!!
			System.out.println("야옹~!");
		}
	
}

