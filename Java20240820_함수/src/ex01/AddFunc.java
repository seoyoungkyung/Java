package ex01;

public class AddFunc {

	public static void main(String[] args) {
		
		int sum = add(10,20);		//함수값 넘겨줄때 넘기는 값은 인자값이라고함.(10,20)
		System.out.println("sum : "+ sum);
		

	}
	
	
	
	static int add(int num1, int num2) {
		
		int add = num1+num2;
		
		return add;			//add값이 리턴타입이랑 일치해야함(int->정수형)
	}


}