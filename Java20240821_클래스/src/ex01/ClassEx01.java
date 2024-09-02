package ex01;

import java.util.Scanner;

	public class ClassEx01 {

		public static void main(String[] args) {
		
	/*
	 * 멤버변수는 외부 공개하지 않는다.
	 * 그러면
	 * int a;
	 * a=10;
	 * System.out.println(a); ->즉, a 변수를 초기화해야 사용가능하다.
	 * 마찬가지로 멤버변수를 반드시 초기화해야한다.
	 * 초기화하는 방법 2가지
	 * 1. 생성자 2. setter를 이용해서 멤버변수 초기화한다.		
	 */
			Student k = new Student();
			
//			k.나이 = 50;
//			k.이름 = "kk";
//			k.전화번호 = "010-1234-56780";
//			k.info();
//			
//			Student k2 = new Student();
//			k2.나이 = 30;
//			k2.이름 = "k2k";
//			k2.전화번호 = "010-9456-5212";
//			k2.info();
		
		
		
	}
}

	//접근제한자 : private < default < protected < public
	//private -> 같은 클래스 내에서만 공개
	//default -> 같은 package내에서 공개
	//protected -> 다른 package내에서도 상속하면 공개
	//public -> 모두 공개
	
	class Student{		//클래스명 첫글자는 대문자, 변수 및 함수는 소문자
		
		private String 이름;
		private int 나이;
		private String 전화번호;
		
		void info() {
			System.out.printf("이름 : %s, 나이 : %d, 전화번호 : %s\n",이름,나이,전화번호);
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