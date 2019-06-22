package hashmapdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
public static void main(String[] args) {
		
		
		HashSet<String> set1 = new HashSet<>();
		
		set1.add("白百合");
		set1.add("马蓉");
		set1.add("潘金莲");
		set1.add("杨贵妃");
		set1.add("赵飞燕");
		set1.add("王昭君");
		set1.add("西施");
		
		// 获取set的长度
		int size = set1.size();
		System.out.println(size);
		
		
		// 移除元素
		set1.remove("马蓉");
		System.out.println(set1.size());
		
		
		// 遍历set集合:用迭代器来取数据
		Iterator<String> iterator = set1.iterator();
		while(iterator.hasNext()) {   // hasNext()方法是用来下移“数据指针”，并判断是否还有数据
			String next = iterator.next();   // next()是取当前“数据指针”上的数据
			System.out.println(next);
		}
		
		// 增强for循环:内部封装了迭代器的使用
		for(String tmp:set1) {
			System.out.println(tmp);
		}
		
		
		// 数组也可以用增强for循环来遍历
		int[] arr = new int[] {3,5,7,9,2};
		for(int x:arr) {
			System.out.println(x);
		}
		
		
		// arraylist也可以用增强for循环来遍历
		ArrayList<Product> pdts = new ArrayList<>();
		pdts.add(new Product("1", "肥皂", 12.45f, 2));
		pdts.add(new Product("2", "香皂", 12.45f, 3));
		pdts.add(new Product("3", "洗衣粉", 12.45f, 1));
		
		for(Product p:pdts) {
			System.out.println(p.getpName());
		}
	}

}
