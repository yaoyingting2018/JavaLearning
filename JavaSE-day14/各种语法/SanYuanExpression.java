package cn.edu360.javase24.day14.demo;

import cn.edu360.javase24.day13.datafind.demo.Product;

/**
 * ��Ԫ���ʽ���÷�
 * @author ThinkPad
 *
 */
public class SanYuanExpression {

	public int getMax(int a, int b) {
		// ��Ԫ���㸳����һ���﷨��������ǲ������ʽ�����ұ���Ҫ���ص����ֽ��
		// ��������ǳ����ģ��򷵻أ���ߵ�ֵ����������������أ��ұߵ�ֵ
		int result = a > b ? a : b;
		return result;
	}
	
	
	public Product getMaxPriceProduct(Product p1,Product p2) {
		
		return p1.getPrice()>p2.getPrice()?p1:p2;
		
	}
}
