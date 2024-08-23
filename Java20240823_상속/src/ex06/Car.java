package ex06;

public class Car extends Vehicle {

	String fuelType;		//연료타입
	int seatingCapacity; 	//탑승인원
	
	
	public Car(String licensePlate,String owner,String fuelType,int seatingCapacity){
		super(licensePlate,owner);
		
		this.fuelType = fuelType;
		this.seatingCapacity = seatingCapacity;
	}
	
	@Override
	double calculateMaintenanceCost() {
		return seatingCapacity* 10000.0;
	}
	
	 void info() {
		 super.info();
		 System.out.println("연료 " + fuelType + "\n탑승인원 : " + seatingCapacity + "\n정비 비용 : " + calculateMaintenanceCost());
	 }
	
}
