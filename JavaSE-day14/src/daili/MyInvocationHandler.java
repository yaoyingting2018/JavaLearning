package daili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		if (method.getName().equals("eat")) {
			System.out.println("我一点都不喜欢吃" + args[0]);
		}
		
		if (method.getName().equals("speak")) {
			String speak = new LoginServiceImpl().speak((String) args[0]);
			return speak;
		}
		
		if (method.getName().equals("say")) {
			if (method.getParameterTypes().length > 0) {
				System.out.println("我爱死" + args[0] + "了");
			} else {
				System.out.println("你调的是say()方法，但是我就打印这句话了");

			}

		}
		return null;
	}

}

