package day04;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(10);
		list.add(20);
		list.add(18);
		// 从arraylist中读取数据
		int a=list.get(0);
		System.out.println(a);		
		System.out.println("------------------------");
		// 遍历list： 将整个arraylist的数据按脚标顺序全部打印出来
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("------------------------");
		// 从list中移除数据
		list.remove(1);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		list.set(2, 34);
		System.out.println(list.get(2));
	}

}
