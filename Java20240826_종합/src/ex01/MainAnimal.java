package ex01;

public class MainAnimal {

	public static void main(String[] args) {
		
		Animal aniaml =new Animal("동물");
		aniaml.info();
	}

}

class Animal{
	
	private String name;
	
	public Animal() {}
	
	public Animal(String name) {
		this.name = name;
	}
	
	void speak() {
		
	}
	
	void info() {
		System.out.println(name+ " 입니다.");
	}
}