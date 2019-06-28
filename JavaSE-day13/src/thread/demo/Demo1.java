package thread.demo;

public class Demo1 implements Runnable {
	private String name;
	
	public Demo1(String name) {
		this.name = name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println("啊....."+name);
		}
		
	}

}