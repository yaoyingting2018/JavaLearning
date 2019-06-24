package diffcult;

import java.util.ArrayList;
import java.util.Set;

public class ProductServiceImpl implements ProductService {

ProductDao productDao = new ProductDaoImpl();
	
	@Override
	public void addProduct(Product p) {
		productDao.addProduct(p);
	}
	

	@Override
	public ArrayList<Product> getAllProducts() {
		ArrayList<Product> pList = new ArrayList<>();
		Set<Product> pSet = productDao.getAllProducts();
		for(Product p: pSet) {
			pList.add(p);
		}
		return pList;
	}
	

	@Override
	public Product getProductById(String pId) {
		
		return productDao.getProductById(pId);
	}

	@Override
	public Product getProductByName(String pName) {

		return productDao.getProductByName(pName);
	}

	@Override
	public ArrayList<Product> getProductsByPriceRange(float minPrice, float maxPrice) {
		
		return productDao.getProductsByPriceRange(minPrice, maxPrice);
	}

	@Override
	public void removeProductById(String pId) {
		productDao.removeProductById(pId);
		
	}

	@Override
	public void updateName(String pId, String newName) {
		Product productById = productDao.getProductById(pId);
		productById.setpName(newName);
		
		productDao.updateProduct(productById);
		
	}

	@Override
	public void updatePrice(String pId, float newPrice) {
		Product productById = productDao.getProductById(pId);
		productById.setPrice(newPrice);
		
		productDao.updateProduct(productById);
		
	}

	@Override
	public void updateStockNum(String pId, int newStockNum) {
		Product productById = productDao.getProductById(pId);
		productById.setStockNum(newStockNum);
		
		productDao.updateProduct(productById);
		
	}

}
