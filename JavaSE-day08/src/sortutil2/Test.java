package sortutil2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
	public static void main(String[] args) {

		// 造数据
		ArrayList<User> uList = new ArrayList<>();
		User u1 = new User("1", "a", 18,2000);
		User u2 = new User("2", "b", 19,3000);
		User u3 = new User("3", "c", 28,1800);
		User u4 = new User("4", "d", 20,2300);
		uList.add(u1);
		uList.add(u2);
		uList.add(u3);
		uList.add(u4);
		
		// 构造一个排序工具
		SortUtil<User> sortUtil = new SortUtil<>();
	
		sortUtil.sort(uList, new AgeBijiaoqi());
		for(User u:uList){
			System.out.println(u);
		}
		System.out.println("-------------------------");
		/**
		 * 对product list数据排序
		 */
		ArrayList<Product> pList = new ArrayList<>();
		pList.add(new Product("1", "皮鞭", 10.8f, 2));
		pList.add(new Product("2", "红酒", 12.8f, 3));
		pList.add(new Product("3", "粉红吸顶灯", 15.8f, 4));
		pList.add(new Product("4", "水床", 19.8f, 5));
		pList.add(new Product("5", "橄榄油", 10.2f, 3));
		
		SortUtil<Product> sortUtil2 = new SortUtil<>();
		
		// 按价格比
		sortUtil2.sort(pList, new PriceBijiaoqi());
		for(Product p:pList){
			System.out.println(p);
		}
		System.out.println("-------------------------");
		// 按数量比
		sortUtil2.sort(pList,new BijiaoQi<Product>() {
			
			@Override
			public boolean bijiao(Product o1, Product o2) {
				if(o1.getNum() > o2.getNum()) {
					return true;
				}
				return false;
			}
		});
		for(Product p:pList){
			System.out.println(p);
		}
		System.out.println("-------------------------");
		
		/**
		 * 对list排序有现成的工具Collections可用
		 * 升序
		 */
		Collections.sort(pList,new Comparator<Product>() {
			// 返回正数，则表示o1 > o2
			// 返回负数，则表示o1 < o2
			// 返回0 ， 则表示o1 = o2
			@Override
			public int compare(Product o1, Product o2) {
				float res = o1.getPrice() - o2.getPrice();
				if(res>0) {
					return 1;
				}
				return -1;
			}
		});
		
		for(Product p:pList){
			System.out.println(p);
		}
		System.out.println("-------------------------");
		
		
		
		// 降序
		Collections.sort(pList,new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				float res = o1.getPrice() - o2.getPrice();
				if(res>0) {
					return -1;
				}
				return 1;
			}
		});
		
		
		for(Product p : pList) {
			System.out.println(p);
		}		
		
		
	}

}
