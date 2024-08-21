package part02;

import java.util.Scanner;

public class Page201ㅡ9 {

	public static void main(String[] args) {

		int count = 0;
		int[] score = null;
		
		boolean flag =true;
		while(flag) {
			System.out.println("--------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------");
			System.out.println("선택 >");
			
			Scanner sc = new Scanner(System.in);
			int num = Integer.parseInt(sc.nextLine());
			
			switch (num) {
			case 1:
				System.out.println("학생수> ");
				count = sc.nextInt();
				score = new int[count];
				break;
				
			case 2:
				
				for(int i = 0 ; i < count ;++i)
				{
					System.out.println("scores[" + i +"] >");
					score[i] = sc.nextInt();
				}
				break;
			case 3:
					
				for(int i = 0 ; i <count; ++i)
				{
					System.out.println("score[" + i + "] :" + score[i]);
				}
				
			 break;
			 
			case 4:
				
				int avg =0;
				for(int i = 0 ; i < count; ++i)
				{
					avg += score[i];
				}
				
				avg = avg / count;
				System.out.println(avg);
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + num);
			}
			
		}

	}

}
