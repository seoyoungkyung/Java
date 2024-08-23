package ex05_강제타입변환;

public class PersonMain {

	public static void main(String[] args) {

		
		//상위클래스(Person)는 하위클래스(Student)를 참조할 수 있다.
		//단, 접근할 수 있는 영역은 상위클래스(Person) 내로 한정된다.
		
		Person p1 = new Person();
		
		Person p2 = new Student();
		
		Person p3 = new PartTimeStudent();
		
		Student s1 = new Student();
		
		Student s2 = new PartTimeStudent();
		
		PartTimeStudent pts1 = new PartTimeStudent();
		
		/*
		 * Student s2 = new Person(); --->X
		 * 이유: s2는 student 참조변수이기 때문에
		 * student 와 person 정보를 다 사용할 수 있다.
		 * 그러나 person 객체를 참조하면 그 객체안에는 person 정보만 있기 때문에 기능이 제한된다.
		 */
		
		Student ss2 = (Student)p2;
		PartTimeStudent st2 = (PartTimeStudent)p2;
		PartTimeStudent ss3 = (PartTimeStudent)p2;
		
		// Student s3 = (Student)p1 -->X
		
		
		
		
		
	}

}
