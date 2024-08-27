package moblie;

public class Ltab extends Mobile{


	public Ltab() {}
	
	public Ltab(String moblieName,int batterySize,String osType) {
		super(moblieName,batterySize,osType);
	}

	
	@Override
	void operate(int time) {
		int tmp = getBatterySize() - time*10;
		setBatterySize(tmp);
	}

	@Override
	void charge(int time) {
		int tmp = getBatterySize() + time*10;
		setBatterySize(tmp);
	}
}
