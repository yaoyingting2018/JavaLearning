package shop;

import java.util.ArrayList;

public class CartManagement {
private ArrayList<Product> cart = new ArrayList<>();
	

	// �����ﳵ�������Ʒ  ����Ĳ��������¸�ʽ��   pdt1:1,pdt2:3,pdt3:1
	public void addProdcutToCart(String selectPdts,ProductManagement pmgt) {

		String[] split = selectPdts.split(",");
		
		for(int i=0;i<split.length;i++) {
			String[] pdtAndNum = split[i].split(":");
			
			Product product = new Product();
			
			product.setProductId(pdtAndNum[0]);
			product.setNum(Integer.parseInt(pdtAndNum[1]));
			// ��취��ȫ��Ʒ���ͼ۸�
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
	
	
	// �ӹ��ﳵ���Ƴ���Ʒ
	
	
	
	// ��ӡ���ﳵ��Ϣ
	public void showCart() {
		
		for(int i=0;i<cart.size();i++) {
			System.out.println(cart.get(i));
		}
		
	}
	
	
	
	// �޸Ĺ��ﳵ�е���Ʒ����
	
	

}
