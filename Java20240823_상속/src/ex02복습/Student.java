package ex02복습;

public class Student extends Person{

	private String school;
	private String studentID;
	
	public Student() {}
		
	
	public Student(String school,String studentID) {
		this.school = school;
		this.studentID = studentID;
	}
	
	public Student(String name,int age,String school,String studentID) {
		super(name,age);
		this.school = school;
		this.studentID = studentID;
	}
	
	@Override
	public void introduce() {
		super.introduce();
		System.out.printf("학교는 %s이고, 학번은 %s 입니다.\n",school,studentID);
	}
	
	public void study() {
		System.out.println(name+"이(가) 공부 중입니다.");
	}
}
