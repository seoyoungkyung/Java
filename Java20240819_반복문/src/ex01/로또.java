package ex01;

import java.util.Random;

public class 로또 {

	public static void main(String[] args) {
		//로또 -> 5게임
		
		int[] lotto = new int[6];
		//(int)Math.random()*45) +1
		//random.nextlnt(45)+1
		
		Random random = new Random();
		
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<6; j++) {
				int tmp =random.nextInt(45)+1;
				boolean flag = false;
				
				for(int k=0; k<j; k++) {	//같은 숫자 중복체크
					if(lotto[k] == tmp) {
						flag = true;
						j--;	 //참인것은 j값에 넣을 수 없으니 그전 배열로 돌아가야한다.
						break;	//참이면 그 전단계로 돌아가기위한 함수 선언을 해야 위 함수로올라감
					}
				}
				
				if(flag == false) {
					lotto[j] = tmp;
					System.out.print(lotto[j]+ " , ");
				}
			}
			System.out.println();
		}
	
		

	}

}
