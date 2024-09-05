package ex04;

 

public class 예외처리01 {

	public static void main(String[] args) {
		
		/*
		 * try~catch
		 */
		
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		
		//try => 문제가 될 소지가 있는 경우 try{}블럭안 기입
		//catch => 예외(문제)가 발생하면 처리하는 블럭
		try{
			for(int i =0; i<arr.length + 1;i++)
				sum += arr[i];						//배열의 범위 벗어난 경우출력
													//int num = 6/0;(분모가 0인경우출력)
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위 벗어난 경우");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("분모가 0인 경우");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("null를 참조한 경우..");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("그 외 예외 처리구문");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("두 수 나눈 결과는 "+sum);
		System.out.println("프로그램 종료!!");
		

	}

}
