package ex01;

public class FunctionEx01 {

	public static void main(String[] args) {
		func1();	//함수(메소드)호출	
		
		func2(15);
		
		int n = func3(15);		//int n = 1;  [반환타입이 있을경우 int 사용 해야함]
		
		if(n==1) System.out.println("홀수");
		else System.out.println("짝수");
		
		double n1 = (double)func4(16);
		
		if(n1==1)System.out.println("5의 배수가 아님");
		else System.out.println("5의 배수");
		
	}
					//     void : 반환타입, func1 : 함수명, () : 매개변수
					//()입력값없음 void출력값 없음
			
			
			//	func1 - 반환타입x,입력x 경우
	
	static void func1() {				
		System.out.println("매개변수(함수에게 값입력하지 않는다), 반환타입 없는 함수!");
	}
	
			//	func2 -	반환타입x, 입력o 경우
	
	static void func2(int num) {
		if(num % 2 == 0)
			System.out.println("입력값은 짝수!");
		else
			System.out.println("입력값은 홀수!");
	}
	
			//	func3 -	반환타입o, 입력o 경우
	
	static int func3(int num) {
		if(num % 2 == 0)
			return 0;	//짝수
		else
			return 1;	//홀수
	}
	
	static int func4(double num) {
		if(num % 5 ==0)
			return 0;
		else
			return 1;
	}
}
