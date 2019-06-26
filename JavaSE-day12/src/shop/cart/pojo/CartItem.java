package shop.cart.pojo;

import java.io.Serializable;

/**
 * 本实体类用来描述购物车中的商品信息
 * @author ThinkPad
 *
 */
public class CartItem implements Serializable{
	
	private String pId;
	private String pName;
	private float price;
	private int buyNum;
	
	public CartItem() {
		// TODO Auto-generated constructor stub
	}
	
	public void set(String pId, String pName, float price, int buyNum) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.buyNum = buyNum;
	}

	
	public CartItem(String pId, String pName, float price, int buyNum) {
		super();       // 子类的构造函数中可以调用父类中定义的构造函数
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.buyNum = buyNum;
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
	public int getBuyNum() {
		return buyNum;
	}
	public void setBuyNum(int buyNum) {
		this.buyNum = buyNum;
	}
	@Override
	public String toString() {
		return "CartItem [pId=" + pId + ", pName=" + pName + ", price=" + price + ", buyNum=" + buyNum + "]";
	}
}