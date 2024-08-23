package ex05_강제타입변환;

public class PartTimeStudent extends Student{
	
	String job;
	int pay;
	
	public PartTimeStudent() {}
	
	public PartTimeStudent(String job,int pay) {
		this.job = job;
		this.pay = pay;
	}


	public PartTimeStudent(String name,int age,String school, String stduentID,String job,int pay) {
		super(name,age,school,stduentID);
		
		this.job = job;
		this.pay = pay;
	}
	
	@Override
	public void introduce() {
		super.introduce();
		System.out.println(job+"에서 근무 하고있고 " + pay+"원을 받습니다.");
	}
}