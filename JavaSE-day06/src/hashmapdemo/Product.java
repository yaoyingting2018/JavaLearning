package hashmapdemo;

public class Product {
	private String pId;
	private String pName;
	private float price;
	private int number;
	
	public Product(){
		
	}
	
	public Product(String pId, String pName, float price, int number) {
		
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.number = number;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getpId() {
		return pId;
	}

	public String getpName() {
		return pName;
	}

	public float getPrice() {
		return price;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", price=" + price
				+ ", number=" + number + "]";
	}
	
	
	
	

}
