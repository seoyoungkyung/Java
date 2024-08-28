package TV문제;

public class TVTTest {

	
	public static void main(String[] args) {
		SaleTV saletv = new SaleTV("SALETV-1", 40, 1, 300000);
		RentalTV rentaltv = new RentalTV("RENTALTV-10", 42, 1, 100000);
		
		saletv.channelUp();
		saletv.channelUp();
		rentaltv.channelDown();
		rentaltv.channelDown();
		rentaltv.channelDown();
		
		printAllTV(saletv);
		printAllTV(rentaltv);
		
		printRentalTV(rentaltv);
		
	}
	static void printAllTV(TV tv) { 

	
		System.out.println(tv.toString());
		
		if(tv instanceof SaleTV stv) {
			stv.play();
			
		}
		if(tv instanceof RentalTV rtv) {
			rtv.play();
			
		}

		if(tv instanceof SaleTV) {
			((SaleTV) tv).sale();
		}
		
	}
	static void printRentalTV(Rentable tv) {
		tv.rent();
	}
}
