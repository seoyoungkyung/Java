package part5_인터페이스;

public class Cargoplane extends Plane{
	
	public Cargoplane() {}
	public Cargoplane(String planeName,int fuelSize) {
		super(planeName,fuelSize);
	}
	void flight(int distance) {

			fuelSize -=5*distance;
		
	}
}
