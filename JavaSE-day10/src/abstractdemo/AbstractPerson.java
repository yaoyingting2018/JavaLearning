package abstractdemo;

public abstract class AbstractPerson {
	public String name;
	public int age;
	
	//abstract 声明这个方法是一个抽象方法
	public abstract void say();
	
	public void eat() {
		System.out.println("正在吃饭......");
	}
}
