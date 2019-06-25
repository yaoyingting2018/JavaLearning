package abstractdemo;
/**
 * 用extends关键字来表示对指定的Person类进行继承
 * 那么，AmericanPerson就具有了Person父类中的属性和方法
 * 
 * @author ThinkPad
 *
 */
public class AmericanPerson extends Person{
	public  String hairColor;
	
	// 子类中可以重写父类的方法
	@Override
	public void say() {
		System.out.println("hello moto");
	}
	
	
	
	public void shualai() {
		System.out.println("我就无赖，你咋地，能咋地....就炸你大使馆，你能咋地");
	}

}
