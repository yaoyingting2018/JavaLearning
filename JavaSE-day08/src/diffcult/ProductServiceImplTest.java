package diffcult;

import java.util.ArrayList;

import org.junit.Test;

public class ProductServiceImplTest {
	/**
	 * 测试添加商品功能
	 */
	@Test
	public void testAdd() {
		ProductServiceImpl service = new ProductServiceImpl();
		Product p = new Product("p1", "手环", 199.9f, 10000);

		// 测试添加商品的功能
		service.addProduct(p);
		Product p1=service.getProductById("p1");
		System.out.println(p1);
	}

	
	/**
	 * 测试根据id去商品的功能
	 */
	@Test
	public void testGetById() {

		ProductServiceImpl service = new ProductServiceImpl();
		Product p = new Product("p1", "手环", 199.9f, 10000);

		// 测试添加商品的功能
		service.addProduct(p);

		// 测试根据id去商品的功能
		//Product productById = service.getProductById("p2");
		Product productById = service.getProductById("p1");
		System.out.println(productById);

	}
	
	
	/**
	 * 测根据name取商品
	 */
	@Test
	public void testGetByName() {
		ProductServiceImpl service = new ProductServiceImpl();
		Product p = new Product("p1", "手环", 199.9f, 10000);

		// 测试添加商品的功能
		service.addProduct(p);
		
		Product productByName = service.getProductByName("手2环");
		System.out.println(productByName);
		Product p1 = service.getProductByName("手环");
		System.out.println(p1);
		
	}
	
	
	/**
	 *  测试价格范围查询商品
	 */
	@Test
	public void testGetByPriceRange() {
		
		ProductServiceImpl service = new ProductServiceImpl();
		Product p1 = new Product("p1", "手1环", 199.9f, 10000);
		Product p2 = new Product("p2", "手2环", 299.9f, 10000);
		Product p3 = new Product("p3", "手3环", 399.9f, 10000);
		Product p4 = new Product("p4", "手4环", 499.9f, 10000);

		// 测试添加商品的功能
		service.addProduct(p1);
		service.addProduct(p2);
		service.addProduct(p3);
		service.addProduct(p4);
		
		ArrayList<Product> pList = service.getProductsByPriceRange(200, 400);
		System.out.println(pList);
		
	}
	
	/**
	 * 修改商品名称功能的测试
	 */
	@Test
	public void testUpdateProductName() {
		ProductServiceImpl service = new ProductServiceImpl();
		Product p1 = new Product("p1", "手1环", 199.9f, 10000);
		service.addProduct(p1);
		
		service.updateName("p1", "魔戒");
		
		Product productById = service.getProductById("p1");
		System.out.println(productById);
		
	}
	
	/**
	 * 修改商品价格功能的测试
	 */
	@Test
	public void testUpdateProductPrice() {
		ProductServiceImpl service = new ProductServiceImpl();
		Product p1 = new Product("p1", "手1环", 199.9f, 10000);
		service.addProduct(p1);
		
		service.updatePrice("p1", 222.2f);
		
		Product productById = service.getProductById("p1");
		System.out.println(productById);
	}
	
	
	/**
	 * 修改商品库存功能的测试
	 */
	@Test
	public void testUpdateProductStock() {
		ProductServiceImpl service = new ProductServiceImpl();
		Product p1 = new Product("p1", "手1环", 199.9f, 10000);
		service.addProduct(p1);
		
		service.updateStockNum("p1", 9000);
		
		Product productById = service.getProductById("p1");
		System.out.println(productById);
	}
}
