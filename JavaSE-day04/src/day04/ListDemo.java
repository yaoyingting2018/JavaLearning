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
		System.out.println("���ֵΪ��" + max);

		// ��--����Сֵ
		int min = ListUtils.getMin(list);
		System.out.println("��СֵΪ��" + min);

		// ��--��ƽ��ֵ
		float avg = ListUtils.getAvg(list);
		System.out.println("ƽ��ֵΪ��" + avg);

	}

}
