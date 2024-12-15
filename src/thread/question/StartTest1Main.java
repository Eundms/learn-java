package thread.question;

public class StartTestMain {
	public static void main(String[] args) {
		CounterThread thread = new CounterThread();
		thread.start();
	}
}
