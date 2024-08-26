package part03_상속;

import java.util.concurrent.ConcurrentSkipListSet;

public class Car extends Vehicle {

	String fuelType;
	int seatingCapacity;
	
	Car(String licensePalate,String owner,String fuelType,int seatingCapacity){
	super(licensePalate,owner);
	this.fuelType = fuelType;
	this.seatingCapacity = seatingCapacity;
	}
	
	
	double calculateMaintenanceCost() {
		return seatingCapacity*1000;
	}
	
	void Info() {
		super.Info();
		System.out.println("연료타입 : "+fuelType+"\n탑승인원 : "+seatingCapacity+"\n정비비용 : "+ calculateMaintenanceCost());
	}
}
