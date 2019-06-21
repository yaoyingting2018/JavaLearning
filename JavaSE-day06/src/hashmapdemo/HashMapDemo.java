package hashmapdemo;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		// 构造一个hashmap对象
		HashMap<String, String> map1 = new HashMap<>();

		// 往hashmap中添加数据，如果key重复，则会覆盖
		map1.put("1", "白百合");
		map1.put("1", "马蓉");

		// 继续添加
		map1.put("2", "王宝强");
		map1.put("3", "黄渤");
		map1.put("4", "靳东");
		map1.put("5", null);

		// 获取map中的数据
		String a = map1.get("3");
		System.out.println(a);

		// 获取map的长度
		int size = map1.size();
		System.out.println(size);

		// 从map中移除数据
		String remove = map1.remove("3");
		System.out.println(remove);

		// 判断数据是否存在
		// 方法1：再去get那个移掉的key，看是否还能获取到value
		String b = map1.get("5");
		System.out.println(b);

		// 方法2：可以利用map的contains功能判断指定的key是否存在
		boolean c = map1.containsKey("5"); // 此方法才能真正确定map中是否存在指定的key
		System.out.println(c);

		// hashmap的遍历：

		Set<String> keySet = map1.keySet();
		for (String id : keySet) {
			System.out.println(map1.get(id));
		}
	}

}
