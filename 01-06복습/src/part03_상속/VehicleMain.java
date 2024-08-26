package part03_상속;

public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle car1 = new Car("123가4567", "홍길동", "Gasoline", 5);
		car1.Info();
		
		
		System.out.println("------------------------------------------");
		
		Vehicle car2 = new Turck("789가1564", "홍길동", 10);
		car2.Info();
		
		
	}

}
