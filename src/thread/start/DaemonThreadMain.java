package thread;

public class DaemonThreadMain {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": main() start");
		DaemonThread daemonThread = new DaemonThread();
		daemonThread.setDaemon(true); // 데몬 스레드 여부에 따라 메인 스레드가 기다릴지 정할 수 있음
		daemonThread.start();
		System.out.println(Thread.currentThread().getName() + " : main() end");
	}

	static class DaemonThread extends Thread {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + ": Daemon run()");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			System.out.println(Thread.currentThread().getName() + ": Daemon run()");
		}
	}

}
