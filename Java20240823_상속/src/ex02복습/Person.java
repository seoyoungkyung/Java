package ex02복습;

public class Person {

	String name;
	int age;
	
	public Person() {}
	
	public  Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void introduce() {
		System.out.printf("안녕하세요, 제 이름은 %s이고, 나이는 %d입니다.\n",name,age);
	}
	
	public void walk() {
		System.out.println(name+"이(가)걷고있습니다.");
	}
}
