package day04;

import java.util.ArrayList;

public class OrderTest {
	public static void main(String[] args) {
		Order o1 = new Order();
		o1.orderId = "1";
		
		// ���������������û�����
		User u_zwj = new User("1","���޼�","�ƽ�vip");
		o1.user = u_zwj;
		
		// ������Ʒ�б�
		ArrayList<Product> pdts = new ArrayList<Product>();
		Product p1 = new Product("p1","�����",18.8f,10);
		Product p2 = new Product("p2","������",28.8f,5);
		pdts.add(p1);
		pdts.add(p2);
		
		o1.pdts = pdts;
		
		// ��Order����o1�ϵ��÷���setAmountFee()�������ܽ��������ϵ�����amountFee��ֵ
		o1.setAmountFee();
		
		// ��Order����o1�ϵ��÷���setToPayFee()�������ܽ��������ϵ�����toPayFee��ֵ
		o1.setToPayFee();
		
		
		System.out.println("�����ܽ�" + o1.amountFee);
		System.out.println("����Ӧ����" + o1.toPayFee);
		
	}

}
