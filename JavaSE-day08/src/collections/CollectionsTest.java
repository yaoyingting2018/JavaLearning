package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsTest {
public static void main(String[] args) {
		
		Product p1 = new Product("1","a",10,9);
		Product p2 = new Product("2","b",20,9);
		Product p3 = new Product("3","c",15,6);
		Product p4 = new Product("4","d",30,9);
		
		ArrayList<Product> pList = new ArrayList<>();
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		pList.add(p4);
		// 用Collections工具来排序
		// 方式1：传专门的比较器给工具，本方式最通用，想按什么比就按什么比
		Collections.sort(pList, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				if(o1.getPrice() > o2.getPrice()) {
					return 1;
				}
				return -1;
			}
		});
		
		for(Product p:pList){
			System.out.println(p);
		}
		
		
		ArrayList<User> uList = new ArrayList<>();
		User u1 = new User("1", "a", 18,2000);
		User u2 = new User("2", "b", 19,3000);
		User u3 = new User("3", "c", 28,1800);
		User u4 = new User("4", "d", 20,2300);
		uList.add(u1);
		uList.add(u2);
		uList.add(u3);
		uList.add(u4);
		
		// 方式2：不传专门的比较器给工具,前提是，list中的数据类型本身可比较
		// （数据类型本身要实现一个接口Comparable），然后就要实现其中的方法compareTo()
		Collections.sort(uList);
		
		
		
		for(User u:uList){
			System.out.println(u);
		}
		
		
	}
}
