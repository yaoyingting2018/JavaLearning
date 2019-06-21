package shop;

import java.util.ArrayList;

public class CartManagement {
private ArrayList<Product> cart = new ArrayList<>();
	

	// 往购物车中添加商品  传入的参数是如下格式：   pdt1:1,pdt2:3,pdt3:1
	public void addProdcutToCart(String selectPdts,ProductManagement pmgt) {

		String[] split = selectPdts.split(",");
		
		for(int i=0;i<split.length;i++) {
			String[] pdtAndNum = split[i].split(":");
			
			Product product = new Product();
			
			product.setProductId(pdtAndNum[0]);
			product.setNum(Integer.parseInt(pdtAndNum[1]));
			// 想办法补全商品名和价格
			ArrayList<Product> pdts=pmgt.getPdts();
			for(int j=0;j<pdts.size();j++){
				if(pdts.get(j).getProductId().equals(pdtAndNum[0])){
					product.setProductName(pdts.get(j).getProductName());
					product.setPrice(pdts.get(j).getPrice());
				}
			}
			cart.add(product);
		}
		
	}
	
	
	// 从购物车中移除商品
	
	
	
	// 打印购物车信息
	public void showCart() {
		
		for(int i=0;i<cart.size();i++) {
			System.out.println(cart.get(i));
		}
		
	}
	
	
	
	// 修改购物车中的商品数量
	
	

}
