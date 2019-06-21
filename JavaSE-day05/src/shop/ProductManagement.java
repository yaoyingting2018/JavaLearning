package shop;

import java.util.ArrayList;

/**
 * 此类的功能： 1、保存所有的商品数据 2、提供操作这些数据的方法
 * 
 * @author ThinkPad
 * 
 */

public class ProductManagement {
	// 用来装商品对象的list集合
	private ArrayList<Product> pdts = new ArrayList<>();

	/**
	 * 用来往pdts商品list中添加一个商品
	 * 
	 * @param p
	 */
	public void addProduct(Product pwww) {
		this.pdts.add(pwww);
	}

	/**
	 * 将pdts商品list中的所有商品打印到控制台
	 */
	public void showProducts() {
		for (int i = 0; i < pdts.size(); i++) {
			System.out.println(pdts.get(i));
		}
	}
	
	public ArrayList<Product> getPdts(){
		return this.pdts;
	}

}
