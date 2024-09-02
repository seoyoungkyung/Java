package part5_인터페이스;

public class AirplaneTest {

	public static void main(String[] args) {
		Plane[] plane = new Plane[2];
		plane[0] = new Airplane("L747 ", 1000);
		plane[1] = new Cargoplane("C40", 1000);
		
		AirplaneTest.printInfo(plane);
		plane[0].flight(100);
		plane[1].flight(100);
		AirplaneTest.printInfo(plane);
		plane[0].refuel(200);
		plane[1].refuel(200);
		AirplaneTest.printInfo(plane);
	}
	public static void printInfo(Plane[] list) {
		System.out.println("Plane         fuelSize");
		System.out.println("-------------------------");
		for(int i = 0; i<list.length;i++) {
			System.out.println(" "+list[i].getPlaneName()+" "+list[i].getFuelSize());
		}
		
	}
}
