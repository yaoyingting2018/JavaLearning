package day04;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.pId = "1";
		p1.pName = "����";
		p1.price = 2.5f;
		p1.number = 2;
		
		Product p2 = new Product();
		p2.pId = "2";
		p2.pName = "����";
		p2.price = 25.5f;
		p2.number = 2;
		
		Product p3 = new Product();
		p3.pId = "3";
		p3.pName = "����";
		p3.price = 15.5f;
		p3.number = 1;
		
		Product p4 = new Product();
		p4.pId = "4";
		p4.pName = "׶��";
		p4.price = 18;
		p4.number = 2;
		
		
		Product p5 = new Product();
		p5.pId = "5";
		p5.pName = "���;�";
		p5.price = 8;
		p5.number = 2;
		
		ArrayList<Product> pdts  = new ArrayList<Product>();
		
		pdts.add(p1);
		pdts.add(p2);
		pdts.add(p3);
		pdts.add(p4);
		pdts.add(p5);
		
		// ����list�е�������Ʒ���ܽ��
		float amount = 0;
		for(int i=0;i<pdts.size();i++) {
			amount += (pdts.get(i).price * pdts.get(i).number);
		}
		
		System.out.println("�ܳɽ���" + amount);
		
		// ����list�е�������Ʒ�е�����ߵ���Ʒ
		
		Product tmp = pdts.get(0);
		for(int i=1;i<pdts.size();i++) {
			if(pdts.get(i).price > tmp.price) {
				tmp = pdts.get(i);
			}
		}
		
		System.out.println("������ߵ���ƷΪ�� " + tmp.toString());
		// ����list�е�������Ʒ�гɽ������ߵ���Ʒ
		tmp = pdts.get(0);
		for(int i=1;i<pdts.size();i++) {
			if(pdts.get(i).price*pdts.get(i).number > tmp.price*tmp.number) {
				tmp = pdts.get(i);
			}
		}
		
		System.out.println("���ɽ������ߵ���ƷΪ�� " +  tmp.toString());
		
		
		
		/**
		 * ���list�е�������ǰ3����Ʒ
		 */
		// 1���Ȱ���������
		for(int i=0;i<pdts.size()-1;i++) {
			for(int j=0;j<pdts.size()-1-i;j++) {
				if(pdts.get(j).price < pdts.get(j+1).price) {
					Product t = pdts.get(j);
					Product p_j1 = pdts.get(j+1);
					pdts.set(j, p_j1); // ���ű�jλ���ϵ����ݻ���j+1λ���ϵ�����
					pdts.set(j+1, t);  // ���ű�j+1λ���ϵ����ݻ���jλ���ϵ�����
				}
				
			}
		}
		
		// 2���ٴ�ӡ��ǰ3����Ʒ��Ϊ������ߵ�3����Ʒ
		System.out.println("�������ǰ��������ƷΪ�� ");
		for(int i=0;i<3;i++) {
			tmp = pdts.get(i);
			System.out.println(tmp.toString());
		}
	}

}
