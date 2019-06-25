package abstractdemo;

public class ChinesePerson extends Person{
	public void killJapanese() {
		System.out.println("killJapanese...");
	}
	
	@Override
	public void say() {
		System.out.println("你好，吃了吗?");
	}

}
