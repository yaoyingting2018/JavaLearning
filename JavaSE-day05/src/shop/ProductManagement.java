package shop;

import java.util.ArrayList;

/**
 * ����Ĺ��ܣ� 1���������е���Ʒ���� 2���ṩ������Щ���ݵķ���
 * 
 * @author ThinkPad
 * 
 */

public class ProductManagement {
	// ����װ��Ʒ�����list����
	private ArrayList<Product> pdts = new ArrayList<>();

	/**
	 * ������pdts��Ʒlist�����һ����Ʒ
	 * 
	 * @param p
	 */
	public void addProduct(Product pwww) {
		this.pdts.add(pwww);
	}

	/**
	 * ��pdts��Ʒlist�е�������Ʒ��ӡ������̨
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
