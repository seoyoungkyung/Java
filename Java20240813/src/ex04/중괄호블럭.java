package ex04;

import java.util.Scanner;

/*
 * 이클립스 단축키
 * 줄복사 : ctrl + alt + 방향키(상,하)
 * 줄삭제 : ctrl + d
 * 줄이동 : alt + 방향키(상,하)
 * 창분할 : ctrl + shift + [(토클기능)]
 * 화면확대 : ctrl + m
 * 
 * 
 * 윈도우 + shift + s  ---> 부분캡처가능
 */
public class 중괄호블럭 {

	public static void main(String[] args) {
		
		int n = 100;
		n = 200;
		
		int kor;	//변수 선언(MAIN안 전체에서 사용가능)
		kor = 100;
		System.out.println(kor);	//변수 사용
		
		
		{
			//블럭 안 내용은 블럭 내에서만 사용가능
			int num = 10;
			System.out.println(num);
		}

		{
			int num2 =20;
			System.out.println(num2);
		}
		
		{
			int num2 =30;
			System.out.println(num2);
			
		}
		
		System.out.println(kor);
		System.out.print(kor);
		System.out.print(kor);
		System.out.print("kor\n");
		
		
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();	//아무거나입력
		
		System.out.println(line);
		
		int number = sc.nextInt(); //정수만 입력
		System.out.println(number);	
		
		
	}

}
