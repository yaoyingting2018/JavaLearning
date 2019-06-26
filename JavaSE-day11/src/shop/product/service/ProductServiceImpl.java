package shop.product.service;

import java.util.List;

import shop.product.dao.ProductDao;
import shop.product.dao.ProductDaoImpl;
import shop.product.pojo.Product;

public class ProductServiceImpl implements ProductService{

	ProductDao productDao = new ProductDaoImpl();
	
	@Override
	public List<Product> getAllProducts()  throws Exception {
		List<Product> pList = productDao.getAllProducts();
		return pList;
	}

	@Override
	public List<Product> getProductsByCateName(String cateName) throws Exception  {
		List<Product> pList = productDao.getProductsByCateName(cateName);
		
		return pList;
	}

	@Override
	public List<Product> getProductsByPriceRange(float min, float max)  throws Exception {
		List<Product> pList = productDao.getProductsByPriceRange(min, max);
		return pList;
	}
	
	

	@Override
	public Product getProductsById(String pId)  throws Exception {
		Product p = productDao.getProductsById(pId);
		return p;
	}

	
	// p01,香蕉,10.8,,1000,水果,0   
	@Override
	public boolean addProduct(String productInfoString)  throws Exception {
		String[] split = productInfoString.split(",");
		Product p = new Product(split[0], split[1], Float.parseFloat(split[2]),Integer.parseInt(split[3]),split[4],split[5]);
		
		boolean addProduct = productDao.addProduct(p);
		
		return addProduct;
	}

	@Override
	public boolean updateProductName(String pId, String pName) throws Exception  {
		
		Product product = productDao.getProductsById(pId);
		product.setpName(pName);
		
		boolean updateProduct = productDao.updateProduct(product);
		return updateProduct;
	}

	@Override
	public boolean updateProductPrice(String pId, float price)  throws Exception {
		
		Product product = productDao.getProductsById(pId);
		product.setPrice(price);
		
		boolean updateProduct = productDao.updateProduct(product);
		return updateProduct;
	}

	@Override
	public boolean updateProductStock(String pId, int stockNum)  throws Exception {
		
		Product product = productDao.getProductsById(pId);
		product.setStockNum(stockNum);
		
		boolean updateProduct = productDao.updateProduct(product);
		return updateProduct;
	}

	@Override
	public boolean updateProductStatus(String pId, String status)  throws Exception {
		
		Product product = productDao.getProductsById(pId);
		product.setStatus(status);
		
		boolean updateProduct = productDao.updateProduct(product);
		return updateProduct;
	}

}