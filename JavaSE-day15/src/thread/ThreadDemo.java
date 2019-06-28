package thread;

public class ThreadDemo {
	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("我爱你，祖国"+i);
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("我爱你，毛主席"+i);
				}
			}
		});
		
		t1.start();
		t2.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("我爱你，周总理"+i);
		}

	}
}
