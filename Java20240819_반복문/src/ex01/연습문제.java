package ex01;

public class 연습문제 {

	public static void main(String[] args) {
		
		//int 형 배열 참조 변수 nArr설정
		int[] nArr = new int[5];
		
		
		//배열 초기화 -> 값 범위는 1~100 => 랜덤함수 이용해서
		for(int i=0; i<5; ++i)
			nArr[i] = (int)(Math.random()*100)+1;
		
		for(int i=0; i<5; i++)
			System.out.println(nArr[i]+ " , ");
		
		//최대값 & 최소값 구하기
		int max,min;
		max = min = nArr[0];
		
		for(int i=0; i<5; i++) {
			if(nArr[i]>max) max = nArr[i];
			if(nArr[i]<min) min = nArr[i];
		}
		System.out.printf("\n최대값 : %d, 최소값 : %d\n", max,min);
		
		//총점 & 평균
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += nArr[i]; //sum= sum+nArr[i]
			}
		double avg =0;
		avg =sum/5.0;	//system.out.prinft(nArr.length);
		System.out.printf("\n합계 : %d, 평균 : %.2f\n", sum,avg);	//0.2는 소수점 2번째까지
		
		//오름차순 정렬(이중 for)
		for(int i=0; i<nArr.length; i++) { //1~5회전
			for(int j=0; j<nArr.length-1; j++) {	//j -> 0~3
				if(nArr[j] > nArr[j+1]) {
					int tmp = nArr[j];
					nArr[j] = nArr[j+1];
					nArr[j+1] = tmp;
				}
			}
		}
		
		for(int i=0; i<nArr.length; i++)
			System.out.println(nArr[i] + " , ");
	}

}
