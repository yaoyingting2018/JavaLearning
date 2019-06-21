package day04;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.pId = "1";
		p1.pName = "肥皂";
		p1.price = 2.5f;
		p1.number = 2;
		
		Product p2 = new Product();
		p2.pId = "2";
		p2.pName = "手铐";
		p2.price = 25.5f;
		p2.number = 2;
		
		Product p3 = new Product();
		p3.pId = "3";
		p3.pName = "鞭子";
		p3.price = 15.5f;
		p3.number = 1;
		
		Product p4 = new Product();
		p4.pId = "4";
		p4.pName = "锥子";
		p4.price = 18;
		p4.number = 2;
		
		
		Product p5 = new Product();
		p5.pId = "5";
		p5.pName = "风油精";
		p5.price = 8;
		p5.number = 2;
		
		ArrayList<Product> pdts  = new ArrayList<Product>();
		
		pdts.add(p1);
		pdts.add(p2);
		pdts.add(p3);
		pdts.add(p4);
		pdts.add(p5);
		
		// 计算list中的所有商品的总金额
		float amount = 0;
		for(int i=0;i<pdts.size();i++) {
			amount += (pdts.get(i).price * pdts.get(i).number);
		}
		
		System.out.println("总成交金额：" + amount);
		
		// 计算list中的所有商品中单价最高的商品
		
		Product tmp = pdts.get(0);
		for(int i=1;i<pdts.size();i++) {
			if(pdts.get(i).price > tmp.price) {
				tmp = pdts.get(i);
			}
		}
		
		System.out.println("单价最高的商品为： " + tmp.toString());
		// 计算list中的所有商品中成交金额最高的商品
		tmp = pdts.get(0);
		for(int i=1;i<pdts.size();i++) {
			if(pdts.get(i).price*pdts.get(i).number > tmp.price*tmp.number) {
				tmp = pdts.get(i);
			}
		}
		
		System.out.println("单成交金额最高的商品为： " +  tmp.toString());
		
		
		
		/**
		 * 求出list中单价排名前3的商品
		 */
		// 1、先按单价排序
		for(int i=0;i<pdts.size()-1;i++) {
			for(int j=0;j<pdts.size()-1-i;j++) {
				if(pdts.get(j).price < pdts.get(j+1).price) {
					Product t = pdts.get(j);
					Product p_j1 = pdts.get(j+1);
					pdts.set(j, p_j1); // 将脚标j位置上的数据换成j+1位置上的数据
					pdts.set(j+1, t);  // 将脚标j+1位置上的数据换成j位置上的数据
				}
				
			}
		}
		
		// 2、再打印出前3个商品即为单价最高的3个商品
		System.out.println("单价最高前三名的商品为： ");
		for(int i=0;i<3;i++) {
			tmp = pdts.get(i);
			System.out.println(tmp.toString());
		}
	}

}
