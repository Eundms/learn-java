package thread;

import static util.MyLogger.*;

public class InnerRunnableMainV4 {
	public static void main(String[] args) {
		log("main() start");

		Thread thread = new Thread(()->log("run()"));
		thread.start();

		log("main() end");

	}
}
