package moblie;

public class Otab extends Mobile {
	
	
	public Otab() {}
	
	public Otab(String moblieName,int batterySize,String osType) {
		super(moblieName,batterySize,osType);
	}
	
		
	
	@Override
	void operate(int time) {
		int tmp = getBatterySize() - time*12;
		setBatterySize(tmp);
	
	}

	@Override
	void charge(int time) {
		int tmp = getBatterySize() + time*8;
		setBatterySize(tmp);
		
	}

}
