package part5_인터페이스;

public abstract class Plane {
	String planeName;
	int fuelSize;
	
	public Plane() {}
	public Plane(String planeName,int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	public int getFuelSize() {
		return fuelSize;
	}
	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	void refuel(int fuel) {
		fuelSize += fuel;
	}
	void flight(int distance) {
		fuelSize--;
	}
	
}
