package ex07;

import java.util.Scanner;

public class 은행계좌 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		은행계좌설계 계좌번호1 = new 은행계좌설계();
		계좌번호1.계좌번호= 123546-564565;
		계좌번호1.소유자이름 = "k";
		계좌번호1.잔액 = 0;
		계좌번호1.info();

		은행계좌설계 계좌번호2 = new 은행계좌설계();
		계좌번호2.계좌번호= 123546-564565;
		계좌번호2.소유자이름 = "k2";
		계좌번호2.잔액 = 0;
		계좌번호2.info();
		
		
		
			
		}
		
		
		
		
	}



class 은행계좌설계{
	
	int 계좌번호;
	String 소유자이름;
	int 잔액;
	
	void info() {
			System.out.printf("계좌번호 : %s\n , 이름: %s, 잔액: %d");
				}
	void 입금() {
		System.out.println("입금액을 입력해주세요.");
				}
	void 출금() {
		System.out.println("출금액을 입력해주세요.");
				}
	void 잔액() {
		System.out.println("잔액은 : ");
	
	}
	
}