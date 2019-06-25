package product;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) throws Exception {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		ProductDao dao = new ProductDaoImpl();
		
		
		while(flag) {
			System.out.println("1.添加商品  2.查看商品   3.退出");
			
			String line = sc.nextLine();
			
			switch(line) {
			
			case "1":
				System.out.println("请输入商品信息，例如  p1,六个核桃,4.5");
				String nextLine = sc.nextLine();
				dao.addProduct(nextLine);
				break;
				
			case "2":
				ArrayList<Product> pdts = dao.getAllProducts();
				for(Product p:pdts) {
					System.out.println(p);
				}
				break;
				
			case "3":
				flag = false;
				break;
			default:
				System.out.println("你有病啊你，你不会看菜单啊");
				break;
			}
		}
	}
}
