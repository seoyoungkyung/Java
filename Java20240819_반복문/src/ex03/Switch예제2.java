package ex03;

public class Switch예제2 {

	public static void main(String[] args) {
		
		int n = (int)(Math.random()*12)+1; 	//1~12
		System.out.println("n : "+ n);
		
		switch(n) {
		case 1:								//0자리에 올수있는 것은 정수,문자열
		case 2:
		case 3:
			System.out.println("봄");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("여름");
			break;							
		case 7:
		case 8:
		case 9:
			System.out.println("가을");
			break;							
		case 10:
		case 11:
		case 12:
			System.out.println("겨울");
			break;							//break문 없으면 그냥 걸리는 값에서 쭉 값이 다 찍힘
		
		}

	}

}
