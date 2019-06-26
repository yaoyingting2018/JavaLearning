package shop.cart.service;

import java.util.List;

import shop.cart.dao.CartDao;
import shop.cart.pojo.CartItem;
import shop.product.dao.ProductDao;
import shop.product.dao.ProductDaoImpl;
import shop.product.pojo.Product;

public class CartServiceImpl implements CartService {
	CartDao cartDao = null;
	ProductDao productDao = new ProductDaoImpl();

	/**
	 * 当页面上的用户点击添加商品到购物车时，
	 * 
	 * 1、判断购物车数据库中是否已经有该用户的数据
	 * 
	 * 2、如果该用户存在，继续判断该商品是否在他的购物项hashmap中
	 * 
	 * 3、如果用户和购物项都存在，本方法只做叠加商品数量的事
	 * 
	 * 4、如果用户存在，但商品不存在，要做的事： 添加这个商品到该用户的购物项hashmap中
	 * 
	 * 5、如果用户不存在，为这个用户构造一个购物项hashmap，添加到购物车数据库中
	 * 
	 */
	@Override
	public boolean addItemToCart(String userId, String pId, int buyNum) throws Exception {
		boolean addItemToCart;

		// 先判断购物车数据库中是否有该用户
		boolean checkIfUserExist = cartDao.checkIfUserExist(userId);

		// 如果该用户确实已存在于购物车数据库
		if (checkIfUserExist) {
			// 再判断该商品是否存在与购物项中
			boolean checkIfItemExsit = cartDao.checkIfItemExsit(userId, pId);
			if (checkIfItemExsit) {
				// 先取出这个人已有的这个购物项数据
				CartItem item = cartDao.getItemById(userId, pId);
				// 然后把之前的数量+本次的数量，通过dao,写入数据库
				addItemToCart = cartDao.updateItemBuyNum(userId, pId, buyNum + item.getBuyNum());

			} else {
				// 先根据pId从商品管理模块的dao中获取商品信息
				Product productsById = productDao.getProductsById(pId);

				// 然后构造一个购物项实体对象，并填入商品数据
				CartItem item = new CartItem();
				item.set(pId, productsById.getpName(), productsById.getPrice(), buyNum);

				// 再利用购物车dao将这个购物项添加到用户已有的购物车数据中
				addItemToCart = cartDao.addItemToCart(userId, item);

			}
			// 如果该用户在购物车数据库中不存在
		} else {

			// 先根据pId从商品管理模块的dao中获取商品信息
			Product productsById = productDao.getProductsById(pId);

			// 然后构造一个购物项实体对象，并填入商品数据
			CartItem item = new CartItem();
			item.set(pId, productsById.getpName(), productsById.getPrice(), buyNum);

			// 再利用购物车dao将这个购物项新增到购物车中
			addItemToCart = cartDao.addNewUserItemToCart(userId, item);

		}

		return addItemToCart;
	}

	@Override
	public boolean removeItemFromCart(String userId, String pId) throws Exception {
		boolean removeItemFromCart = cartDao.removeItemFromCart(userId, pId);
		return removeItemFromCart;
	}

	@Override
	public boolean updateItemBuyNum(String userId, String pId, int buyNum) throws Exception {
		boolean updateItemBuyNum = cartDao.updateItemBuyNum(userId, pId, buyNum);
		return updateItemBuyNum;
	}

	@Override
	public List<CartItem> getAllItems(String userId) throws Exception {
		List<CartItem> allItemsFromCart = cartDao.getAllItemsFromCart(userId);
		return allItemsFromCart;
	}

}