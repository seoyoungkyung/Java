package ex04;

public class GenericExample {

	public static void main(String[] args) {
		
		Product<Tv, String> product1 = new Product();
		
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		
		Tv tv = product1.getKind();
		String tvModel1 = product1.getModel();
		System.out.println(tvModel1);
		
		System.out.println("----------------------");
		Product<Car, Integer> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel(10);
		Car car = product2.getKind();
		Integer carModel = product2.getModel();
		System.out.println(carModel);
		
	}

}
