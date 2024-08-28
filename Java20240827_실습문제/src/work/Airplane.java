package work;

public class Airplane extends Plane{

	public Airplane() {}
	public Airplane(String planeName,int fuelSize) {
		super(planeName,fuelSize);
	}
	
	public void fligth(int distance) {
		super.flight(fuelSize);
		for(int i=0;i>10;i++) {
			fuelSize -=30;
		}
	}
}
