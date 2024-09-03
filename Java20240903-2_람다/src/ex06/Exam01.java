package ex06;

//매개변수가 없고,반환형 있는 경우
interface MaxInterface{
	int max(int num1 , int num2);
}
public class Exam01 {

	public static void main(String[] args) {

		
		//익명클래스
		MaxInterface max1 = new MaxInterface() {
			
			@Override
			public int max(int num1, int num2) {
				return (num1>num2) ? num1 : num2 ;
			}
		};
		
		//람다
		MaxInterface max2 = (num1, num2) -> ( num1 > num2 ) ? num1 : num2 ;
		
		System.out.println(max1.max(5, 10));
		System.out.println(max2.max(7, 11));
	}

}
