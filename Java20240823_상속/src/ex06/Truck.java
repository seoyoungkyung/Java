package ex06;

public class Truck extends Vehicle {

	double loadCapacity; //톤
	
	
	
	public Truck(String licensePlate,String owner,double loadCapacity){
		super(licensePlate,owner);
		this.loadCapacity = loadCapacity;
	}
	
	@Override
	double calculateMaintenanceCost() {
		return loadCapacity*20000.0;
	}
	
	 void info() {
		 super.info();
		 System.out.println("적재 용량 : "+loadCapacity);
		 System.out.println("정비비용 : "+calculateMaintenanceCost());
	 }
}
