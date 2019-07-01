package thread.singleton;
/**
 * 单例设计模式： 核心思想：就是这个类，在程序的任何其他模块中，获取它的对象时，
 * 拿到的永远是同一个对象
 * 懒汉式的写法
 * 
 * @author ThinkPad
 *
 */
import java.util.HashMap;

public class ProductDb {
	public HashMap<String, String> pMap = new HashMap<>();

	static ProductDb pdb = null;

	private ProductDb() {

	}

	/*
	 * public static synchronized ProductDb getProductDb() {
	 * 
	 * if(pdb==null) { 
	 * pdb = new ProductDb(); 
	 * } 
	 * return pdb;
	 * 
	 * }
	 */

	public static ProductDb getProductDb() {

		if (pdb == null) {
			synchronized (ProductDb.class) {
				if (pdb == null) {
					pdb = new ProductDb();
				}
			}
		}

		return pdb;

	}
}
