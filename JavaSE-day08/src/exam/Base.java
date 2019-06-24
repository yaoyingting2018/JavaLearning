package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class Base {
	public static void main(String[] args) {
		
		/**
		 * 数组题
		 */
		int[] arr = new int[] {2,3,7,5,4,8};
		// 用增强for循环
		for(int a:arr) {
			System.out.println(a);
		}
		
		for(int i=arr.length-1;i>-1;i--) {
			System.out.println(arr[i]);
		}
		
		
		/**
		 * arraylist题
		 */
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(15);
		list.add(25);
		list.add(35);
		
		for(Integer a: list) {
			System.out.println(a);
		}
		
		for(int i=list.size()-1;i>-1;i--) {
			System.out.println(list.get(i));
		}
		
		
		/**
		 * hashset题
		 */
		HashSet<String> set = new HashSet<>();
		set.add("小泽玛利亚");
		set.add("波多野结衣");
		set.add("苍井空");
		set.add("加藤鹰");
		
		for(String a:set) {
			System.out.println(a);
		}
		
		
		/**
		 * hashmap题
		 */
		HashMap<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 3);
		map.put("c", 2);
		map.put("d", 6);
		map.put("e", 7);
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String,Integer> ent:entrySet) {
			if(ent.getValue() % 2 !=0) {
				System.out.println(ent.getKey() + "," + ent.getValue());
			}
		}
	}
}
