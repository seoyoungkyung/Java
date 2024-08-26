package ex03;

public class Main {

	public static void main(String[] args) {

		Payment c = new CreditCardPayment();
		c.makePayment(10000);
		
		c = new CashPayment();
		c.makePayment(15000);
		
		c = new PayPalPayment();
		c.makePayment(60000);
			
		
//		Payment cp = new CashPayment();
//		Payment pp = new PayPalPayment();
//		Payment cc = new CreditCardPayment();
//		
//		cp.makePayment(10000);
//		pp.makePayment(50000);
//		cc.makePayment(40000);

		

	}

}
