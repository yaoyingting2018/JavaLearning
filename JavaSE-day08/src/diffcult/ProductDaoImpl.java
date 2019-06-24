package diffcult;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ProductDaoImpl implements ProductDao {

	/**
	 * 添加一个商品到数据库
	 */
	@Override
	public void addProduct(Product p) {
		
		ProductDatabase.pMap.put(p.getpId(), p);
		
	}

	@Override
	public Set<Product> getAllProducts() {
		Collection<Product> values = ProductDatabase.pMap.values();
		
		HashSet<Product> pSet = new HashSet<>();
		for(Product p:values) {
			pSet.add(p);
		}
		
		return pSet;
	}

	@Override
	public Product getProductById(String pId) {
		 
		Product product = ProductDatabase.pMap.get(pId);
		
		return product;
	}

	@Override
	public Product getProductByName(String pName) {
		
		Collection<Product> values = ProductDatabase.pMap.values();
		for(Product p: values) {
			if(p.getpName().equals(pName)) {
				return p;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Product> getProductsByPriceRange(float minPrice, float maxPrice) {
		
		Collection<Product> values = ProductDatabase.pMap.values();
		ArrayList<Product> pList = new ArrayList<>();
		
		for(Product p: values) {
			if(p.getPrice()>=minPrice && p.getPrice() <= maxPrice) {
				pList.add(p);
			}
		}
		return pList;
	}

	@Override
	public void removeProductById(String pId) {
		
		ProductDatabase.pMap.remove(pId);
	}

	@Override
	public void updateProduct(Product p) {
		
		ProductDatabase.pMap.put(p.getpId(), p);
	}

}
