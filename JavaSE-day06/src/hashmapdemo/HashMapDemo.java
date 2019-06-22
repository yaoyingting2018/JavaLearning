package hashmapdemo;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		// 1、造几个product对象，放入一个hashmap中
				Product p1 = new Product("1", "香蕉", 20, 2);
				Product p2 = new Product("2", "橘子", 10, 2);
				Product p3 = new Product("3", "榴莲", 120, 2);
				Product p4 = new Product("4", "香蕉", 20, 2);
				Product p5 = new Product("5", "榴莲", 120, 2);
				Product p6 = new Product("6", "榴莲", 120, 2);

				HashMap<String, Product> pdtMap = new HashMap<>();
				pdtMap.put(p1.getpId(), p1);
				pdtMap.put(p2.getpId(), p2);
				pdtMap.put(p3.getpId(), p3);
				pdtMap.put(p4.getpId(), p4);
				pdtMap.put(p5.getpId(), p5);
				pdtMap.put(p6.getpId(), p6);

				// 2、给我找出hashmap中产品名称重复的数据，并打印出发生了重复的数据产品id：

				// 遍历pdtMap，逐一取出里面的product对象，然后构造一个新的hashmap
				// 然后判断，这个product对象的name在新hashmap是否存在，如果尚不存在，则将这个product对象的name作为key，id作为value放入一个新的hashmap中
				// 如果已存在，则将之前的id拼上这个product的id作为value覆盖进去

				HashMap<String, String> newMap = new HashMap<>();

				Set<String> keySet = pdtMap.keySet();
				for (String id : keySet) {
					Product p = pdtMap.get(id);
					if (newMap.containsKey(p.getpName())) {
						String id_value = newMap.get(p.getpName()); // 从新map中取出已存在的产品id
						newMap.put(p.getpName(), id_value + "," + p.getpId()); // 将新map中的产品id拼上这次从老map中取出的产品的id
					} else {

						newMap.put(p.getpName(), p.getpId());
					}
				}

				Set<String> keySet2 = newMap.keySet();
				for (String name : keySet2) {
					String ids = newMap.get(name);
					System.out.println(ids + "-->" + name);

				}

				// 1,4-->香蕉
				// 3,5,6-->榴莲
	}

}
