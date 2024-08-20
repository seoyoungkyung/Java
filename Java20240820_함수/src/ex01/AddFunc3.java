package ex01;

public class AddFunc3 {

	public static void main(String[] args) {
	
			//정수 값 100넘겨주면 전달하면 함수에서 1~100까지 합의 평균 구해서 리턴시킨다.
		

		double result= func(100);
		
		System.out.println(result);
		
	}
	
	static double func(int n) {
		
		int sum = 0;
		
		for(int i=1; i<=n; i++)
			sum +=i;
		
		return (double)sum/n;
	}



}