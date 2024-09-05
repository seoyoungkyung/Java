package thread;

public class CounterManyThreadMain {

	public static void main(String[] args) {

		Thread threadA = new Thread(new CounterManyThread("A", 1000), "Thread-A");
		Thread threadB = new Thread(new CounterManyThread("B", 500), "Thread-B");
		
		
		threadA.start();
		threadB.start();
	}

}

