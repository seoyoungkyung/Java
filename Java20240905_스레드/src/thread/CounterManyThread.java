package thread;
import static util.MyLogger.log;

public class CounterManyThread implements Runnable{
	private String content;
	private int sleepMs;
	
	public CounterManyThread(String content,int sleepMs) {
		this.content = content;
		this.sleepMs = sleepMs;
	}
	
	@Override
	public void run() {
		while(true) {
		try {
			log(content);
			Thread.sleep(sleepMs);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	 }
  }	
}
