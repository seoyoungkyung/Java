package ex02;

public class MainAnimal {

	public static void main(String[] args) {
		
		Animal aniaml =new Animal("동물");		//객체생성,인스턴스생성
		aniaml.info();	
		
		Animal aniaml2 = new Animal();
		aniaml2.info();
	}

}

class Animal{
	
	private String name;		//멤버 변수,인스턴스 변수 = > 생성된 객체들이 개별적으로 가지고있음.
	private static int count;	//정적 변수,클래스 변수 => 공유자원
	
	public Animal() {
		this("동물");
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	void speak() {
		
	}
	
	void info() {				//메소드,인스턴스메소드
		System.out.println(name+ " 입니다.");
	}
	
	static void staticInfo(){}		//정적메소드,클래스 메소드
	
	//name = "동물"; info(); -->X
		
}
