package ex05;

public class Student {										//클래스명 첫글자는 대문자, 변수 및 함수는 소문자

	
		private String name;
		private int age;
		private String phone;
		public Student() {
			// TODO Auto-generated constructor stub
		}
		
	
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {	//우클릭->소스>겟셋
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		
		
		
		Student(String string, int i, String string2){
			System.out.println("디폴트 생성자 호출");
		}
		
		
		
		void info() {
			System.out.printf("이름 : %s, 나이 : %d, 전화번호 : %s\n",name,age,phone);
			}
		
		void 입실() {
			System.out.println("입실하다.");
			}
		
		void 퇴실() {
			System.out.println("퇴실하다.");
			}
		
		void 조퇴() {
			System.out.println("조퇴하다.");
		}
	

	}

