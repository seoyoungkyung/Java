package work;

public class Cargoplane extends Plane{

	public Cargoplane() {}
	public Cargoplane(String planeName,int fuelSize) {
		super(planeName,fuelSize);
	}
	
	public void fligth(int distance) {
		super.flight(fuelSize);
		for(int i=0;i>10;i++) {
			fuelSize -=50;
		}
	}
}
