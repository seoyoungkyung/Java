package ex01;

import java.util.Random;

public class 로또2 {

	public static void main(String[] args) {
		//로또 -> 5게임
		
		int[] lotto = new int[45];
		int count = 0;
		Random random = new Random();
		for(int i=0; i<45; i++)
			lotto[i] = i+1;
		
		for(int i=0; i<45; i++) {
			int index = random.nextInt(45);
			int tmp = lotto[i];
			lotto[i] = lotto[index];
			lotto[index] = tmp;
			
			if(i == 44) {
				for(int j=0; j<6; j++)
					System.out.print(lotto[j] + " ");
				System.out.println();
				i=-1;
				count++;
			}
			if(count > 4) break;
		}
	}
}

