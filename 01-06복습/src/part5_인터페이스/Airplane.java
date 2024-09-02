package part5_인터페이스;

public class Airplane extends Plane{
	
	public Airplane() {}
	public Airplane(String planeName,int fuelSize) {
		super(planeName,fuelSize);
	}
	
	void flight(int distance) {
		
		
			fuelSize -=3*distance;
		
	}
}
