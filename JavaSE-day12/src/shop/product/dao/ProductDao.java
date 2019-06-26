package shop.product.dao;

import java.util.List;

import shop.product.pojo.Product;

public interface ProductDao {
	// 查询所有商品
		public List<Product> getAllProducts()  throws Exception ;
		
		// 按类别名称查询商品
		public List<Product> getProductsByCateName(String cateName) throws Exception ;
		
		// 按价格范围查询商品
		public List<Product> getProductsByPriceRange(float min,float max) throws Exception ;
		
		// 按ID查询商品
		public Product getProductsById(String pId) throws Exception ;
		
		// 添加商品到数据库	
		public boolean addProduct(Product product) throws Exception ;
		
		// 更新商品数据
		public boolean updateProduct(Product product) throws Exception ;
}
