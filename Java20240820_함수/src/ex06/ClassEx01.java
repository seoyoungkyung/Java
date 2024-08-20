package ex06;

import java.util.Scanner;

public class ClassEx01 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);		//객체생성
		
		Student k = new Student();
		k.나이 = 50;
		k.이름 = "kk";
		k.전화번호 = "010-1234-56780";
		k.info();
		
		Student k2 = new Student();
		k2.나이 = 30;
		k2.이름 = "k2k";
		k2.전화번호 = "010-9456-5212";
		k2.info();
		
		
		
	}
}


	
class Student{		//클래스명 첫글자는 대문자, 변수 및 함수는 소문자
	String 이름;
	int 나이;
	String 전화번호;
	
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
