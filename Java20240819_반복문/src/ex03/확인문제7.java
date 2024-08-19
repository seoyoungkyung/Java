package ex03;

import java.util.Scanner;

public class 확인문제7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int bank = 0;
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			
			String strNum = scanner.nextLine();
			String strNum2 = scanner.nextLine();
			
			switch(strNum) {
			case 1:
				
				System.out.println("예금액> "+ strNum2);
			case 2:
				System.out.println("출금액> "+ strNum2);
			case 3:
				System.out.println("잔고> "+ strNum2);
			case 4:
			System.out.println("프로그램 종료");
			}
		}
		
	}

}
