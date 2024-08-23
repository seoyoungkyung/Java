package ex04;

public class CarMain {

	public static void main(String[] args) {
		
		
		Car car1 = new Car("K3");
		 Car car2 = new Car("G80");
		 Car car3 = new Car("Model Y");
		 
		 car1.info();
		 car2.info();
		 car3.info();
		 Car.showTotalCars();
		 
	}

}

class Car{
	String name;
	static  int num=0;
	
	Car(String name){
		this.name = name;
		num++;
		//System.out.println("차량구입, 이름: " + name);
	}
	
	void info() {
		System.out.println("차량구입, 이름: " + name);
	}
	
	static void showTotalCars() {
		System.out.println("구매한 차량 수: " + num);
	}
}