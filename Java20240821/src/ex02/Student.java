package ex02;

public class Student {

	
		private String name;
		private int age;
		private String phone;
		
		Student(){
			
		} // 디폴트(기본)생성자
		
		
		
		Student(String n){
			name = n;
			age = 10;
			phone = "010-0000-0000";
		}
		Student(String n, int a){
			name = n;
			age = a;
			phone = "010-0000-0000";
		}
		Student(String n, int a, String p){
			name = n;
			age = a;
			phone = p;
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

