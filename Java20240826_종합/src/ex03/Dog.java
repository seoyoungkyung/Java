package ex03;

public class Dog extends Animal{

	int age;
	
	Dog(String name,int age){
		super(name);
		this.age = age;
	}
		
	int getAge() {
		return age;
	}
	
	@Override		//상위클래스 가지고있는 메소드 재정의
	void info(){
		super.info();					//System.out.println(getName()+" 입니다.");
		System.out.println(age +"살 입니다.");
		}
	
	@Override
	void speak() {				//반드시 재정의 필요함!!!!
		System.out.println("멍멍~!");
		}
}
