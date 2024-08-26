package ex02;

public interface TV {		//인터페이스 선언
	
	void powerOn();		//abstract 생략되어있음.(인터페이스는 모두 추상메소드임)
	void powerOff();
	void soundUp();
	void soundDown();
	
	//+ 채널 변경 추가
	default void channelUp() {};
	default void channelDown() {};
	
}
