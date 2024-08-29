package part4_제네릭;

class Person{}
class Worker extends Person{}
class Student extends Person{}
class HighStudent extends Student{}
class MiddleStudent extends Student{}

class Applicant<T>{
	public T kind;
	public Applicant(T kind) {
		this.kind = kind;
	}
}

class Course{
	//모든클래스 참조가능
	public static void registerCourse1(Applicant<?> applicant){
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함");}
	//와일드카드 상한제한
	public static void registerCourse2(Applicant<? extends Student>applicant){
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2을 등록함");}
	//와일드카드 하한제한
	public static void registerCourse3(Applicant<? super Worker>applicant){
			System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함");}
}

public class GenericExample {

	public static void main(String[] args) {
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		
	}

}
