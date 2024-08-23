package ex02복습;

public class PersonMain {

	public static void main(String[] args) {

		Person person = new Person("홍길동", 20);
		person.introduce();
		person.walk();
		
		Student student = new Student("홍길동",20,"아주대학교","12345678");
		student.introduce();
		student.walk();
		student.study();
		
		SalesMan sales = new SalesMan("홍길동", 20,"삼성",10000);
		sales.introduce();
		sales.walk();
		sales.work();

	}

}
