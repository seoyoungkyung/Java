package ex07;

public class LibraryMain {

	public static void main(String[] args) {
		
		LibraryClass b1 = new LibraryClass();
		
		b1.가격 = 25000;
		b1.재고수량 = 100;
		b1.저자 = "신용균";
		b1.제목 = "이것이 자바다.";
		
		b1.입고(12);
		b1.판매(4);
		b1.판매(9);
		b1.총판매금액();
		b1.info();
		
	}

}

class LibraryClass{
	String 제목;
	String 저자;
	int 가격;
	int 재고수량;
	int 판매누적수량;
	
	
	void 판매(int book) {
		재고수량 -=book;
		판매누적수량 +=book;
		System.out.println("판매 : " + book);
	}
	
	void 입고(int book) {
		재고수량 +=book;
		System.out.println("입고 : " +book);
	}
	
	void 총판매금액() {
		System.out.println("총 판매금액 : "+ 판매누적수량*가격);
		
	}
	
	void info() {
		System.out.printf("제목 : %s , 저자 : %s , 가격 : %d , 재고수량 : %d , 판매누적수량 : %d\n", 제목, 저자, 가격, 재고수량,판매누적수량);
	}
}