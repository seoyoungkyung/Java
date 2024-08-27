package moblie;

public abstract  class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;
	

	public Mobile(){}
	
	public Mobile(String mobileName,int batterySize,String osType)
	{
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}

	abstract void operate(int time);
	abstract void charge(int time);
	
	String getMobileName() {
		return mobileName;
	}
	void setMobileName(String a) {
		mobileName = a;
	}
	
	int getBatterySize() {
		return batterySize;
	}
	void setBatterySize(int b) {
		batterySize = b;
	}
	
	String getOsType() {
		return osType;
	}
	void setOsType (String a) {
		osType = a;
	}
}
