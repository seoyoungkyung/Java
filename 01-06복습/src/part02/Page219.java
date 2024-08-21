package part02;

public class Page219 {

	public static void main(String[] args) {
		
		Car2 myCar = new Car2();
		
		System.out.println("제작회사: "+myCar.company);
		System.out.println("모델명: "+myCar.model);
		System.out.println("색깔: "+myCar.color);
		System.out.println("최고속도: "+myCar.maxSpeed);
		System.out.println("현재속도: "+myCar.speed);
		
		myCar.speed = 60;
		System.out.println("수정된 속도: "+myCar.speed);
		
		
		

	}

}

 class Car2 
{
	public String company = "현대자동차";
	public	String model = "그랜저";
	public String color = "검정";
	public int maxSpeed = 350;
	public int speed;
}
