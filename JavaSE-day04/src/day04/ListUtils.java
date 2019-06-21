package day04;

import java.util.ArrayList;

/**
 * 工具类
 * @author ThinkPad
 *
 */
public class ListUtils {
	/**
	 * 对传入的list排序
	 * @param list
	 */
	public static void sort(ArrayList<Integer> list) {
		
		// TODO
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
	
	
	/**
	 * 从传入的list中找到最大值
	 * @param list
	 */
	public static int getMax(ArrayList<Integer> list) {
		int tmp = list.get(0);
		for(int i=1;i<list.size();i++) {
			if(list.get(i) > tmp) {
				tmp = list.get(i);
			}
		}
		
		// 返回结果
		return tmp;
	}
	
	
	
	/**
	 * 从传入的list中找到最小值
	 * @param list
	 */
	public static int getMin(ArrayList<Integer> list) {
		int tmp = list.get(0);
		for(int i=1;i<list.size();i++) {
			if(list.get(i) < tmp) {
				tmp = list.get(i);
			}
		}
		// 返回结果
		return tmp;
	}
	
	/**
	 * 求传入的list的数据平均值
	 * @param list
	 */
	public static float getAvg(ArrayList<Integer> list) {
		int sum = 0;
		for(int i=0;i<list.size();i++) {
			sum += list.get(i);
		}
		
		return (float)sum/list.size();
	}

}
