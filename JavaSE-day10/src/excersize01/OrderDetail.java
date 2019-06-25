package excersize01;

import java.io.Serializable;

public class OrderDetail implements Serializable{
	private String oId;
	private String pId;
	private String pName;
	private float price;
	private int pNum;
	private float amount;
	
	public OrderDetail() {
	}
	
	public OrderDetail(String oId, String pId, String pName, float price, int pNum) {
		this.oId = oId;
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.pNum = pNum;
		this.amount = price * pNum;
	}

	public String getoId() {
		return oId;
	}
	public void setoId(String oId) {
		this.oId = oId;
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
	public int getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	public float getAmount() {
		return amount;
	}
	/**
	 *  不应该由外界传入总金额，应该在内部计算
	 */
	public void setAmount() {
		this.amount = this.price * this.pNum;
	}
	
	
	@Override
	public String toString() {
		return "\n[oId=" + oId + ", pId=" + pId + ", pName=" + pName + ", price=" + price + ", pNum=" + pNum
				+ ", amount=" + amount + "]";
	}
	
}
