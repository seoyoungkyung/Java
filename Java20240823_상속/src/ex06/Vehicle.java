package ex06;

public class Vehicle {

	String licensePlate;	//차량번호
	String owner;			//소유자
	
	
	
	public  Vehicle(String licensePlate,String owner) {
		this.licensePlate = licensePlate;
		this.owner = owner;
	}
	
	
	void startEngine() {
		System.out.println("차량이 시동을 걸었습니다.");
	}
	
	double calculateMaintenanceCost() {
		return 0;
	}
	
	void  info() {
		System.out.printf("차량번호 : %s\n소유자 : %s\n",licensePlate,owner);
	}
	
	
	
	

}
