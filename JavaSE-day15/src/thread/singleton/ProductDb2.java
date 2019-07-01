package thread.singleton;

import java.util.HashMap;

/**
 * 单例设计模式：
 * 核心思想：就是这个类，在程序的任何其他模块中，获取它的对象时，拿到的永远是同一个对象
 * 饿汉式的写法
 * @author ThinkPad
 *
 */
public class ProductDb2 {
	public HashMap<String, String> pMap = new HashMap<>();
	
	static ProductDb2 pdb = new ProductDb2();
	
	
	private ProductDb2() {
		
	}
	
	
	
	public static ProductDb2 getProductDb() {
		
		return pdb;
		
	}
}
