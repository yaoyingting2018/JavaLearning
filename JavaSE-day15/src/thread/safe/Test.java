package thread.safe;

public class Test {
	public static void main(String[] args) {
		KuCun kuCun = new KuCun();

		for (int i = 0; i < 10; i++) {
			new Thread(new SellRunnable(kuCun)).start();
		}

	}
}
