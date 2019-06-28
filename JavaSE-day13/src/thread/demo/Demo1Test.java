package thread.demo;

public class Demo1Test {
	public static void main(String[] args) {
		 
		Demo1 demo11 = new Demo1("张三");
		 
		Demo1 demo12 = new Demo1("李四");
		
		Demo1 demo13 = new Demo1("王五");
		
		
		
		Demo2 demo2 = new Demo2();
		//demo1.run();  // 这样调，只是用单线程普通地执行一下这个run方法而已
		
		// 构造一个线程，指定要执行的逻辑
		Thread thread1 = new Thread(demo11);
		Thread thread2 = new Thread(demo12);
		Thread thread3 = new Thread(demo13);
		Thread thread4 = new Thread(demo2);
		Thread thread5 = new Thread(demo2);
		
		// 这种调用，只是按顺序进行普通的方法调用，是在一个单线程中挨个执行的
		/*thread1.run();
		thread2.run();
		thread3.run();
		thread4.run();
		thread5.run();*/
		
		// 将这5个线程以多线程的方式同时运行
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
	}
}
