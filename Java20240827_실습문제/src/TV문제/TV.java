package TV문제;

public class TV {
	String model;
	int size;
	int channel;
	
	public TV() {}
	public TV(String model,int size,int channel) {
		this.model = model;
		this.size = size;
		this.channel = channel;
	}
	
	public void channelUp() {
		
			if(channel > 10 ) {
			channel = 1;
		}else channel++;
	}
	public void channelDown() {
		channel--;
		if(channel < 1 ) {
			channel = 10;
		}else channel--;
	}
}