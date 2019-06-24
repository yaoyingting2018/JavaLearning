package diffcult;

import java.util.ArrayList;

public interface ProductService {
	// 添加商品
		public void addProduct(Product p);
		
		// 查询所有商品
		public ArrayList<Product> getAllProducts();
		
		// 根据id查商品
		public Product getProductById(String pId);
		
		//  根据name查商品
		public Product getProductByName(String pName);
		
		
		// 根据价格区间查商品
		public ArrayList<Product> getProductsByPriceRange(float minPrice,float maxPrice);
		
		// 删除商品
		public void removeProductById(String pId);
		
		
		// 修改商品名称
		public void updateName(String pId,String newName);
		
		
		// 修改商品价格
		public void updatePrice(String pId,float newPrice);
		
		
		// 修改商品库存数量
		public void updateStockNum(String pId,int newStockNum);
}
