package user;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("1","正常咖啡",98.8f,2);
		Product p2 = new Product("2","人中黄咖啡",198.8f,1);
		Product p3 = new Product("3","象粪咖啡",988.8f,2);
		Product p4 = new Product("4","猫屎咖啡",998.8f,1);
		Product p5 = new Product("5","雀巢咖啡",88.8f,1);
		
		User u1 = new User("1", "李四", "111", "1383838438", 18, 1800);
		User u2 = new User("2", "王五", "111", "1383838438", 28, 2800);
		User u3 = new User("3", "张三", "111", "1383838438", 38, 1900);	
		
		
		//购物车，用hashmap来实现
		HashMap<String, ArrayList<Product>> cartMap = new HashMap<>();
		
		Product p11 = new Product("1","正常咖啡",98.8f,2);
		Product p13 = new Product("3","象粪咖啡",988.8f,4);
		Product p15 = new Product("5","雀巢咖啡",88.8f,1);
		
		ArrayList<Product> zs_pdts = new ArrayList<>();
		zs_pdts.add(p11);
		zs_pdts.add(p13);
		zs_pdts.add(p15);
		
		cartMap.put(u3.getName(), zs_pdts);
		
		
		Product p22 = new Product("2","人中黄咖啡",198.8f,1);
		Product p23 = new Product("3","象粪咖啡",988.8f,2);
		Product p24 = new Product("4","猫屎咖啡",998.8f,1);
		ArrayList<Product> ls_pdts = new ArrayList<>();
		ls_pdts.add(p22);
		ls_pdts.add(p23);
		ls_pdts.add(p24);
		
		cartMap.put(u1.getName(), ls_pdts);
		
		//  测试工具方法，找张三的产品列表
		ArrayList<Product> pdts = ProductTest.findPdtByName(cartMap, "李四");
		System.out.println(pdts);
		
	}
	
	
	/**
	 * 工具方法，根据用户名从购物车中找出他的商品列表
	 * @param cartMap
	 * @param userName
	 * @return
	 */
	public static ArrayList<Product> findPdtByName(HashMap<String, ArrayList<Product>> cartMap,String userName){
		ArrayList<Product> arrayList = cartMap.get(userName);
		
		return arrayList;
	}

}
