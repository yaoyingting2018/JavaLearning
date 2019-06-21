package day04;

public class Product {

	String pId;
	String pName;
	float price;
	int number;

	public Product() {

	}

	public Product(String pId, String pName, float price, int number) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", price=" + price
				+ ", number=" + number + "]";
	}
	
	

}
