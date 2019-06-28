package thread.demo;

public class Demo2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("是......."+i);
		}
	}

}

