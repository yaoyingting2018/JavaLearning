package shop.cart.service;

import java.util.List;

import shop.cart.pojo.CartItem;

public interface CartService {
	/**
	 * 增
	 */
	public boolean addItemToCart(String userId,String pId,int buyNum)  throws Exception ;
	

	/**
	 * 删
	 */
	public boolean removeItemFromCart(String userId,String pId)  throws Exception ;
	
	
	/**
	 * 改
	 */
	public boolean updateItemBuyNum(String userId,String pId,int buyNum)  throws Exception ;
	
	
	/**
	 * 查
	 */
	public List<CartItem> getAllItems(String userId)  throws Exception ;
}
