package thread;

public class ThreadDemo2Test {
	public static void main(String[] args) {
		ThreadDemo2 t1 = new ThreadDemo2();
		ThreadDemo2 t2 = new ThreadDemo2();
		ThreadDemo2 t3 = new ThreadDemo2();
		ThreadDemo2 t4 = new ThreadDemo2();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
