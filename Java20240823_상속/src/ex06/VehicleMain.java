package ex06;

public class VehicleMain {

	public static void main(String[] args) {

		Vehicle car = new Car("123가4567","홍길동","Gasoline",5);
		car.info();
		car.startEngine();
		
		Vehicle truck = new Truck("789나 1011", "이순신" , 10);
		truck.info();
		truck.startEngine();
	}

}
