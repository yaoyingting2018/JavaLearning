package thread.safe;

public class SellRunnable implements Runnable {
	KuCun kuCun;

	public SellRunnable(KuCun kuCun) {
		this.kuCun = kuCun;
	}

	@Override
	public void run() {
		while (true) {
			//System.out.println("本线程是无所不能的..我要这天再遮不住我眼，我要这地再埋不了我心");
			
			// 加一把锁，表示锁住的逻辑同时只能让一个线程来执行
			synchronized (SellRunnable.class) {
			
				if (kuCun.num > 0) {
					try {
						Thread.sleep(50);
						kuCun.num = kuCun.num - 1;
						System.out.println(kuCun.num);
					} catch (Exception e) {

					}
				}
			
			
			}
			
			//System.out.println("从今往后一万年，你们都会记住一个名字：孙悟空.......");
			
			
		}
	}

}
