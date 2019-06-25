package product;

import java.util.ArrayList;

public interface ProductDao {
	public void addProduct(String line) throws Exception;
	
	public ArrayList<Product> getAllProducts() throws Exception;
}
