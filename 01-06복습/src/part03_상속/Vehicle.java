package part03_상속;

public class Vehicle {

	String licensePalate;
	String owner;
	
	public Vehicle(String licensePalate,String owner) {
		this.licensePalate = licensePalate;
		this.owner = owner;
	}
	
	void Info() {
		System.out.println("차량번호 : "+licensePalate+"\n소유자 : "+owner+ "\n차량이 시동을 걸었습니다!!");
	}
	

	double calculateMaintenanceCost() {
		return 0;
	}
	
	
}
