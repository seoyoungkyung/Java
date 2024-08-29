package work;

public class PlaneTest {

	public static void main(String[] args) {
		Plane[] plane = new Plane[2];
		plane[0] = new Airplane("L747", 1000);
		plane[1] = new Cargoplane("C40", 1000);
		
		PlaneTest.printInfo(plane);
		plane[0].flight(100);
		plane[1].flight(100);
		PlaneTest.printInfo(plane);
		plane[0].refuel(200);
		plane[1].refuel(200);
		PlaneTest.printInfo(plane);
		
		

	}
	public static void printInfo(Plane[] list) { 
		
		System.out.println("Plan       fuel");
		System.out.println("-------------------");
		for(int i =0; i<list.length;i++) {
			System.out.printf("%s\t %d\n",list[i].getPlaneName(),list[i].getFuelSize());
		}
	}
	
}
