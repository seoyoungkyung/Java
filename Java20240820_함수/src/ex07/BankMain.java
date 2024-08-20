package ex07;

public class BankMain {

	public static void main(String[] args) {
		BlankClass b1 = new BlankClass();
		
		b1.계좌번호 ="11245454-51";
		b1.소유자이름 = "길동이";
		b1.입금(100000);
		b1.출금(3000);
		b1.잔액();
		b1.info();
		

	}

}

class BlankClass{
	String 계좌번호;
	String 소유자이름;
	int 잔액;
	
	
	void 입금(int money) {
		잔액 += money;
		System.out.println("입금 : "+ money);
		}
	
	void 출금(int money) {
		잔액 -=money;
		System.out.println("출금 : "+ money);
		}
	
	void 잔액() {
		System.out.println("현재잔액 : "+잔액);
		}
	
	void info() {
		System.out.printf("계좌번호: %s, 소유자이름: %s, 잔액: %d\n",계좌번호,소유자이름,잔액);
		}
	
}