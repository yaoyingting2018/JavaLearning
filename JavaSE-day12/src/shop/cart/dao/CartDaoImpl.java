package shop.cart.dao;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import shop.cart.pojo.CartItem;
import shop.constant.DataBasePathConstant;
import shop.utils.FileOperateUtil;

public class CartDaoImpl implements CartDao {
	FileOperateUtil<HashMap<String, CartItem>> fos = new FileOperateUtil<>();

	/**
	 * 在数据库中已有该用户的购物车hashmap的情况下，添加一个商品
	 */
	@Override
	public boolean addItemToCart(String userId, CartItem item) {
		
		return false;
	}

	@Override
	public boolean removeItemFromCart(String userId, String pId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateItemBuyNum(String userId, String pId, int buyNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<CartItem> getAllItemsFromCart(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkIfUserExist(String userId) {

		return false;
	}

	@Override
	public boolean checkIfItemExsit(String userId, String pId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addNewUserItemToCart(String userId, CartItem item) throws Exception {
		File file = new File(DataBasePathConstant.CART_DATA_PATH);
		
		HashMap<String, HashMap<String, CartItem>> cartMap = null;
		if (file.exists()) {
			// 如果文件存在，则从文件中加载出整个购物车hashmap
			cartMap = fos.readMapFromFile(DataBasePathConstant.CART_DATA_PATH);
		} else {
			// 如果该文件不存在， 则构造一个购物车hashmap
			cartMap = new HashMap<>();
		}
		
		// 为该用户构造一个自己的购物项hashmap，并放入购物项
		HashMap<String, CartItem> userItems = new HashMap<>();
		userItems.put(item.getpId(), item);
		
		//将用户的id和他的购物项hashmap放入整个购物系统的数据库hashmap中
		cartMap.put(userId, userItems);
		
		// 然后将整个购物数据库写入文件
		fos.saveMapToFile(cartMap, DataBasePathConstant.CART_DATA_PATH);
		
		return true;
	}

	
	
	/**
	 * 根据用户id和商品id，取出该用户购物车中的购物项数据
	 * @throws Exception 
	 */
	@Override
	public CartItem getItemById(String userId, String pId) throws Exception {
		
		// 先从数据库中读取出整个购物车数据hashmap
		HashMap<String, HashMap<String, CartItem>> cartMap = fos.readMapFromFile(DataBasePathConstant.CART_DATA_PATH);
		HashMap<String, CartItem> userItems = cartMap.get(userId);
		CartItem cartItem = userItems.get(pId);
		
		return cartItem;
	}

}
