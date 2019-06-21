package day04;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(10);
		list.add(20);
		list.add(18);
		ListUtils.sort(list);
		System.out.println(list);

		int max = ListUtils.getMax(list);
		System.out.println("最大值为：" + max);

		// 测--求最小值
		int min = ListUtils.getMin(list);
		System.out.println("最小值为：" + min);

		// 测--求平均值
		float avg = ListUtils.getAvg(list);
		System.out.println("平均值为：" + avg);

	}

}
