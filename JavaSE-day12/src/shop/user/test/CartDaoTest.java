package shop.user.test;

import org.junit.Test;

import shop.cart.dao.CartDaoImpl;
import shop.cart.pojo.CartItem;

public class CartDaoTest {
	@Test
	public void testAddNewUserItem() throws Exception {
		CartDaoImpl cartDaoImpl = new CartDaoImpl();
		CartItem cartItem = new CartItem("p01", "香蕉", 5.8f, 2);
		
		cartDaoImpl.addNewUserItemToCart("zhangsan", cartItem);
	}
	
	
	@Test
	public void testGetItemById() throws Exception {
		CartDaoImpl cartDaoImpl = new CartDaoImpl();
		CartItem itemById = cartDaoImpl.getItemById("zhangsan", "p01");
		System.out.println(itemById);
		
	}
}
