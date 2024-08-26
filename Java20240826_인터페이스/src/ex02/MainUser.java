package ex02;

public class MainUser {

	public static void main(String[] args) {

		TV tv = new SamsungTV();	//new 뒤에 클래스만 바꾸어주면 호환됨.
		
		tv.powerOn();
		
		tv.soundUp();
		tv.soundUp();
		tv.soundUp();

		tv.soundDown();
		
		tv.powerOff();

	}

}
