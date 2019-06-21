package day04;

import java.util.ArrayList;

public class NumberPair {
	public int a;
	public int b;
	
	// 方法：用来封装一段逻辑
		// 方法定义的格式：     public 返回值类型  方法名(){ //逻辑}
		public int getSum() {
			int sum = this.a + this.b;
			return sum;
		}
		
		// 没有返回值的方法，返回值类型用void表示
		public void say() {
			System.out.println("i miss you, 凤姐");
		}
		
		// 带参数但没有返回值的方法  ，同名方法，但是参数列表不一样，叫方法的重载
		public  void say(String name) {
			System.out.println("i miss you," + name);
			
		}
		
		// 带多个参数但没有返回值的方法
		public void say(String name1,String name2) {
			System.out.println(name1 + "想" + name2);
			
		}
		
		// 带参数且有返回值的方法
		public int qiuHe(int a,int b) {
			return a+b;
		}
		
		
		// 用来对一个list排序
		public static void sort(ArrayList<Integer> list) {
			
			for(int i=0;i<list.size()-1;i++) {
				for(int j=0;j<list.size()-1-i;j++) {
					if(list.get(j) > list.get(j+1)) {
						int tmp = list.get(j);
						list.set(j, list.get(j+1));
						list.set(j+1, tmp);
					}
				}
				
			}
			
		}
		
		
		// 用来打印一个list
		public void print(ArrayList<Integer> list) {
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
			
		}

}
