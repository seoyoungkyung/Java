package ex01;

public class MainUser {

	public static void main(String[] args) {
		
//		LgTV tv = new LgTV();
//		tv.power_On();	//전원 on
//		tv.sound_up();
//		tv.sound_up();
//		tv.sound_up();
//		System.out.println(tv.sound);	//3
//		
//		tv.sound_down();
//		tv.sound_down();
//		System.out.println(tv.sound);	//1
//		
//		tv.power_Off();		//전원 off
		
		SamsungTV tv1 = new SamsungTV(0,false);
		
		tv1.IsActive(true);		//전원 on
		tv1.ChangeSound(1);
		tv1.ChangeSound(1);
		tv1.ChangeSound(1);		
		
		tv1.ChangeSound(-1);
		tv1.ChangeSound(-1);	
		tv1.IsActive(false);	//전원 off
				
	}

}
