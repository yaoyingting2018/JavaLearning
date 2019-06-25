package excersize01;

import java.io.Serializable;
/**
 * 用来描述某一个具体事物的类：
 * 实体类
 * javabean
 * @author ThinkPad
 *
 */
public class Order implements Serializable{
	private String oId;
	private String pId;
	private int pNum;
	
	public Order() {
	}
	
	public void set(String oId, String pId, int pNum) {
		this.oId = oId;
		this.pId = pId;
		this.pNum = pNum;
	}
	
	public Order(String oId, String pId, int pNum) {
		super();
		this.oId = oId;
		this.pId = pId;
		this.pNum = pNum;
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
	public int getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	@Override
	public String toString() {
		return "[oId=" + oId + ", pId=" + pId + ", pNum=" + pNum + "]";
	}
}
