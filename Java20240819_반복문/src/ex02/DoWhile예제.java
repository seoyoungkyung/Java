package ex02;

public class DoWhile예제 {

	public static void main(String[] args) {
		
		/*
		 * for : 몇번 회전하는지 아는 경우 사용
		 * While : 횟수를 모를 때 사용
		 * for,while => 조건이 거짓이면 1번도 실행이 안될수있음
		 * do~While : 최소한 한번은 실행을 보장
		 */
		
		int i = 0;
		int sum = 0;
		
		do {
			sum +=i;
			i++;
	
		}while(i<=100);

		System.out.println(sum);
	}

}
