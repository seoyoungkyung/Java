package part03_상속;

public class Turck extends Vehicle {

	double loadCapacity;
	
	
	public Turck(String licensePalate,String owner,double loadCapacity) {
		super(licensePalate,owner);
		this.loadCapacity = loadCapacity;
	}
	
	double calculateMaintenanceCost() {
		return loadCapacity*20000;
	}
	
	void Info() {
		super.Info();
		System.out.println("적재 용량 : " +loadCapacity+" \n정비 비용 : "+calculateMaintenanceCost() );
	}
	
}
