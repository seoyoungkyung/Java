package thread;

public class CounterRunnableMain {

	public static void main(String[] args) {

//		CounterRunnable runnable = new CounterRunnable();
		
		Thread thread = new Thread(new CounterRunnable(), "counter");
		
		thread.start();
				
	}

}
