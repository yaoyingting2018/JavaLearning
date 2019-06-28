package cn.edu360.javase24.day14.demo;

import cn.edu360.javase24.day13.datafind.demo.Product;

/**
 * 三元表达式的用法
 * @author ThinkPad
 *
 */
public class SanYuanExpression {

	public int getMax(int a, int b) {
		// 三元运算赋：是一种语法：？左边是布尔表达式，？右边是要返回的两种结果
		// 如果条件是成立的，则返回：左边的值；如果不成立，返回：右边的值
		int result = a > b ? a : b;
		return result;
	}
	
	
	public Product getMaxPriceProduct(Product p1,Product p2) {
		
		return p1.getPrice()>p2.getPrice()?p1:p2;
		
	}
}
