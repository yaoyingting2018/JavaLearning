package construct;
/**
 * jvm在为一个类构造对象时，所要进行的工作
 * 1、首先执行静态代码，如果有多份静态代码，则从上往下顺序执行
 * 2、然后执行普通代码块
 * 3、然后再执行构造方法
 * @author ThinkPad
 *
 */

public class OrderDatabase {
public static String orderVersion = "500";
	
	static {
		System.out.println("静态代码块执行了....");
		System.out.println("在静态代码赋值前，order版本是：" + orderVersion);
		orderVersion = "1000";
		System.out.println("在静态代码赋值后，order版本是：" + orderVersion);
	}
	
	
	{
		
		System.out.println("哈哈,普通代码块执行了.......");
		
	}
	
	
	
	public OrderDatabase() {
		
		System.out.println("空参构造函数运行了....");
		System.out.println("在构造代码赋值前，order版本是：" + orderVersion);
		orderVersion = "2000";
		System.out.println("在构造代码赋值后，order版本是：" + orderVersion);
	}
	
	public void sayHello() {
		System.out.println("哈哈，sayHello执行了......");
	}

}
