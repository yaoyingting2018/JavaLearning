package daili;

import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectDemo {
public static void main(String[] args) throws Exception {
		
		/*LoginServiceImpl loginServiceImpl = new LoginServiceImpl();
		loginServiceImpl.say();
		loginServiceImpl.say("zhangsan");
		loginServiceImpl.eat();
		
		String speak = loginServiceImpl.speak("lisi");
		System.out.println(speak.toUpperCase());*/
		
		
		/**
		 * 反射的方式来构造对象，及调用方法
		 */
		/*String type = "cn.edu360.javase24.day14.reflect.LoginServiceImpl";
		String func = "say";
		String paramType = "java.lang.String";*/
		
		
		/**
		 * 通过加载配置文件来获取所要调的类名和方法名及方法参数类型
		 */
		Properties props = new Properties();
		// props.put("key","value");
		// 绝对路径加载配置文件
		// props.load(new FileInputStream("D:\\appdev\\javase24\\javase24\\src\\xx.properties"));
		
		// 从工程的类路径的相对路径中加载
		props.load(ReflectDemo.class.getClassLoader().getResourceAsStream("xx.properties"));
		
		String type = props.getProperty("type");
		String func = props.getProperty("func");
		String paramType = props.getProperty("paramType");
		
		/**
		 * 根据类名和方法名、方法参数类型，来用反射的方法构造对象，并调用方法
		 */
		Class<?> forName = Class.forName(type);
		Object instance = forName.newInstance();
		Method method = forName.getMethod(func, Class.forName(paramType));
		method.invoke(instance, "铁蛋儿");
		
	}
}
