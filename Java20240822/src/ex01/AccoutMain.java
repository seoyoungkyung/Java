package ex01;

public class AccoutMain{

	private static int balance;

	public static void main(String[] args) {
	
		Account AccountMain = new Account();
		
		System.out.println("계좌에 10000원을 입금해라");
		AccountMain.deposit(10000);
		
		System.out.println("계좌에서 9000원을 출금해라");
		AccountMain.withdraw(9000);
		
		System.out.println("계좌에서 2000원을 출금시도해라.");
		AccountMain.withdraw(2000);
		
		System.out.println("잔고를 출력해라 잔고 :1000 " );
		System.out.printf("잔액 : %d\n", AccountMain.getBlance());
		
		//AccountMain.balnce == AccountMain.getBlance(); ->맴버변수가 private이기 때문에 get을 사용한다.
	}

}

class Account {
	private int balance;

	void deposit(int amount) {
		balance +=amount;
		}
	void withdraw(int amount) {
		
		if(balance>amount) {
		balance -=amount;
		}
		else{
			System.out.println("잔액부족");
		}
		
		}
		int getBlance() {
		return balance;
		}
	}
