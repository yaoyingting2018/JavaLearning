package day04;

import java.util.ArrayList;

public class OrderTest {
	public static void main(String[] args) {
		Order o1 = new Order();
		o1.orderId = "1";
		
		// 创建订单所属的用户对象
		User u_zwj = new User("1","张无忌","黄金vip");
		o1.user = u_zwj;
		
		// 创建商品列表
		ArrayList<Product> pdts = new ArrayList<Product>();
		Product p1 = new Product("p1","打神鞭",18.8f,10);
		Product p2 = new Product("p2","捆仙索",28.8f,5);
		pdts.add(p1);
		pdts.add(p2);
		
		o1.pdts = pdts;
		
		// 在Order对象o1上调用方法setAmountFee()来计算总金额并给对象上的属性amountFee赋值
		o1.setAmountFee();
		
		// 在Order对象o1上调用方法setToPayFee()来计算总金额并给对象上的属性toPayFee赋值
		o1.setToPayFee();
		
		
		System.out.println("订单总金额：" + o1.amountFee);
		System.out.println("订单应付金额：" + o1.toPayFee);
		
	}

}
