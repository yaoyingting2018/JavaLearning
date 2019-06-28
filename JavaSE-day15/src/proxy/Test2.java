package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;



public class Test2 {
	public static void main(String[] args) {
		
		Actor o1 = (Actor) Proxy.newProxyInstance(Actor.class.getClassLoader(), 
				new Class<?>[] {Actor.class}, new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("宝宝要出场，你先给我安排10个泰森做保镖开路");
				
				new WangBaoQiang().act();
				
				System.out.println("宝宝演戏很辛苦的，演完了，你去给烤俩腰子，焦一点儿的");
				
				return null;
			}
		});
		
		
		
		Actor o2 = (Actor) Proxy.newProxyInstance(Actor.class.getClassLoader(), new Class<?>[] {Actor.class}, new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("xxoo");
				
				new WangBaoQiang().act();
				
				System.out.println("ooxx");
				
				return null;
			}
		});
		
		o1.act();
		
		System.out.println("--------------------");
		o2.act();
		
		
	}
}
