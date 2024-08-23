package ex03;

public class Person {

	
	String name;
	int age;
	
	
	public Person() {}
	
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	//final ->하위클래스에서 introduce() 메소드를 재정의 허용하지 않겠다.
	//public final void introduce()
	public void introduce() {
		System.out.printf("안녕하세요, 제이름은 %s이고, 나이는%d살 입니다.\n" ,name,age);
	}
	
	public void walk() {
		System.out.println(name + "이(가)걷고있습니다.");
	}
}