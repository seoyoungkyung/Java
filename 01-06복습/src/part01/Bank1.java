package part01;

import java.util.Scanner;

public class Bank1 {

	public static void main(String[] args) {
		
		int come;
		int out;
		int save = 0;
		
		boolean flag = true;
		
		while(flag) 
		{
			
			System.out.println("---------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4.종료");
			System.out.println("---------------------");
			System.out.println("선택> ");
			
			Scanner sc = new Scanner(System.in);
			int num = Integer.parseInt(sc.nextLine());
			
		
		switch (num) 
		{
		case 1: 
			System.out.println("예금액> ");
			come = Integer.parseInt(sc.nextLine());
			save += come;
			break;
			
		case 2:
			System.out.println("출금액> ");
			out = Integer.parseInt(sc.nextLine());
			save -= out;
			break;
			
		case 3:
			System.out.println("잔고> "+save);
			break;
			
		case 4:
			flag = false;
			break;
			
		default:
			System.out.println("1~4까지 만 입력하세요!");
		}
	
		}
		System.out.println("프로그램 종료!");
		
	}

}
