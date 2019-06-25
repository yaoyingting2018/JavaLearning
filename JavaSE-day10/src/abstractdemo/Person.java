package abstractdemo;

public class Person {
	public String name;
	private String name2; // private修饰的属性，不能被子类继承
	public int age;     // default 属性，如果跨包，则子类也不能继承
	
	
	public void say() {
		
	}
	
	public void eat() {
		System.out.println("吃饭这种事，不如睡觉好玩");
	}

}
