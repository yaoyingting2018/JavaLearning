package construct;

import java.util.HashMap;

public class XXServiceTest {
	public static void main(String[] args) {
		// 面向接口编程，可以用“接口类型变量”来引用“具体实现类的对象”
		// 这样，写调用逻辑的人，可以在业务实现类开发完成之前就开发自己的调用逻辑代码
		//XXService xxService = null;
		
		// 等接口的实现类开发完成之后，给接口变量赋值为实现类对象即可，后面的代码都不用再动
		XXService xxService = new XXServiceImpl();
		
		// 接收到用户的操作1，就要调用业务类中 的step1方法
		String step1 = xxService.step1();
		System.out.println(step1);
		
		// 接收到用户的操作2，就要调用业务类中 的step2方法
		xxService.step2("1");
		
		// 接收到用户的操作3，就要调用业务类中 的step3方法
		HashMap<String, Integer> step3 = xxService.step3(8);
		System.out.println(step3.get("1"));

	}

}
