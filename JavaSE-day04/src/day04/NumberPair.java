package day04;

import java.util.ArrayList;

public class NumberPair {
	public int a;
	public int b;
	
	// ������������װһ���߼�
		// ��������ĸ�ʽ��     public ����ֵ����  ������(){ //�߼�}
		public int getSum() {
			int sum = this.a + this.b;
			return sum;
		}
		
		// û�з���ֵ�ķ���������ֵ������void��ʾ
		public void say() {
			System.out.println("i miss you, ���");
		}
		
		// ��������û�з���ֵ�ķ���  ��ͬ�����������ǲ����б�һ�����з���������
		public  void say(String name) {
			System.out.println("i miss you," + name);
			
		}
		
		// �����������û�з���ֵ�ķ���
		public void say(String name1,String name2) {
			System.out.println(name1 + "��" + name2);
			
		}
		
		// ���������з���ֵ�ķ���
		public int qiuHe(int a,int b) {
			return a+b;
		}
		
		
		// ������һ��list����
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
		
		
		// ������ӡһ��list
		public void print(ArrayList<Integer> list) {
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
			
		}

}
