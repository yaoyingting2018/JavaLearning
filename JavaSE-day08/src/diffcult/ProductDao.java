package diffcult;

import java.util.ArrayList;
import java.util.Set;

public interface ProductDao {
	// 添加商品
		public void addProduct(Product p);
		
		// 查询所有商品
		public Set<Product> getAllProducts();
		
		// 根据id查商品
		public Product getProductById(String pId);
		
		//  根据name查商品
		public Product getProductByName(String pName);
		
		
		// 根据价格区间查商品
		public ArrayList<Product> getProductsByPriceRange(float minPrice,float maxPrice);
		
		// 删除商品
		public void removeProductById(String pId);
		
		
		// 修改商品
		public void updateProduct(Product p);
}
