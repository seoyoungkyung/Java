package work;

public class PlaneTest {

	public static void main(String[] args) {
		Plane[] plane = new Plane[2];
		plane[0] = new Airplane("L747", 1000);
		plane[1] = new Cargoplane("C40", 1000);
		
		
		

	}
	public static void printInfo(Plane[] list) { 
		
		
		for(int i =0; i<list.length;i++) {
			System.out.println();
		}
	}
	
}
