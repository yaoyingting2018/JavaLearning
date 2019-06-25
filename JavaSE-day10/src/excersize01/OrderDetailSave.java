package excersize01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class OrderDetailSave {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// 先去读取商品数据
				ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("e:/pdt.obj"));
				ArrayList<Product> pList = (ArrayList<Product>) ois1.readObject();
				ois1.close();
				
				// 再去读取订单信息
				ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("e:/order.obj"));
				ArrayList<Order> oList = (ArrayList<Order>) ois2.readObject();
				ois2.close();
				
				
				// 把商品数据从list中导入map中，方便查询
				HashMap<String, Product> pMap = new HashMap<>();
				for(Product p:pList) {
					pMap.put(p.getpId(), p);
				}
				
				
				// 生成订单详情
				ArrayList<OrderDetail> detailList = new ArrayList<>();
				for(Order o:oList) {
					String pId = o.getpId();
					Product product = pMap.get(pId);
					OrderDetail orderDetail = new OrderDetail(o.getoId(), o.getpId(), product.getpName(), product.getPrice(), o.getpNum());
					detailList.add(orderDetail);
				}
				
				// 保存订单详情数据到文件中
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:/order_detail.obj"));
				oos.writeObject(detailList);
				oos.close();
				
				
				// 再从文件中读取detail数据进行验证
				ObjectInputStream ois3 = new ObjectInputStream(new FileInputStream("e:/order_detail.obj"));
				ArrayList<OrderDetail> dList = (ArrayList<OrderDetail>) ois3.readObject();
				ois3.close();
				
				System.out.println(dList);
	}

}
