package product;

public class Product {
	private String pId;
	private String pName;
	private float price;
	
	public Product() {
	}

	public Product(String pId, String pName, float price) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "[pId=" + pId + ", pName=" + pName + ", price=" + price + "]";
	}
}
