package shop;

public class Product {
	private String productId;
	private String productName;
	private float price;
	private int num;

	public Product() {
	}

	public Product(String productId, String productName, float price, int num) {

		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.num = num;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public float getPrice() {
		return price;
	}

	public int getNum() {
		return num;
	}
	/**
	 * toString��һ������ƴװ�����ڲ����ݳ�һ���ַ����ķ���
	 * �ⲿ���ø÷������ɻ�ȡ�������ݵ�ƴ���ַ���
	 */
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName="
				+ productName + ", price=" + price + ", num=" + num + "]";
	}

}
