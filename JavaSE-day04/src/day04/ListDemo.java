package day04;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(10);
		list.add(20);
		list.add(18);
		// ��arraylist�ж�ȡ����
		int a=list.get(0);
		System.out.println(a);		
		System.out.println("------------------------");
		// ����list�� ������arraylist�����ݰ��ű�˳��ȫ����ӡ����
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("------------------------");
		// ��list���Ƴ�����
		list.remove(1);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		list.set(2, 34);
		System.out.println(list.get(2));
	}

}
