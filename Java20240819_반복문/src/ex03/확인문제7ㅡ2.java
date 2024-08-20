package ex03;

import java.util.Scanner;

public class 확인문제7ㅡ2 {

	public static void main(String[] args) {
		int balance = 0;	//잔고
		int deposit = 0;	//예금
		int withdrawal = 0;	//출금
		
		boolean flag = true;	//while을 종료시키는 것
		
		while(flag) {				//while이 true일때만 작동하도록함
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			
			Scanner sc = new Scanner(System.in);
			
			// "1" ==> 1
			System.out.println("선택> ");
			int num = Integer.parseInt(sc.nextLine());	//문자를 정수로
			
			switch(num) {		//switch문에 num을 넣은 이유는 숫자를 받아와 작동시키기 위해
			case 1:
				System.out.println("예금액> ");
				deposit = Integer.parseInt(sc.nextLine());
				balance += deposit;
				break;
			case 2:
				System.out.println("출금액> ");
				withdrawal = Integer.parseInt(sc.nextLine());
				balance -= withdrawal;
				break;
			case 3:
				System.out.println("잔고> "+ balance);
				break;
			case 4:
				flag = false;		//flag가 flase이므로 while문에서 벗어나 아래 System.out.println("프로그램 종료!");이 작동됨
				break;
			default:				//1~4숫자가 아닌 다른숫자 입력시 나타나는 문구를 생성하는것
				System.out.println("1~4 사이 숫자만 입력하세요!");
			}
		}
		System.out.println("프로그램 종료!");
	}

}
