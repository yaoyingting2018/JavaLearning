package day04;

import java.util.ArrayList;

public class Order {
	// 订单id
		public String orderId;
		
		// 订单所属用户（用户对象）
		public User user;
		
		// 订单所包含的商品
		public ArrayList<Product> pdts;
		
		// 订单总金额
		public float amountFee;
		
		// 订单应付金额
		public float toPayFee;

		
		
		public void setAmountFee() {
			float sum = 0;
			for(int i=0;i<this.pdts.size();i++) {
				sum += this.pdts.get(i).price * this.pdts.get(i).number;
			}
			
			this.amountFee = sum;
		}
		
		
		
		public void setToPayFee() {
			
			float tmp = this.amountFee;
			
			// 根据总金额进行打折
			if(this.amountFee >=1000 && this.amountFee <2000) {
				tmp = this.amountFee * 0.98f;
			}
			
			if(this.amountFee >=2000 && this.amountFee <3000) {
				tmp = this.amountFee * 0.95f;
				
			}

			if(this.amountFee >= 3000){
				tmp = this.amountFee * 0.90f;
				
			}

			// 根据用户vip等级打折
			if(user.vipLevel.equals("黄金vip")) {
				tmp = tmp*0.98f;
			}
			
			if(user.vipLevel.equals("钻石vip")) {
				tmp = tmp*0.96f;
			}
			
			if(user.vipLevel.equals("至尊vip")) {
				tmp = tmp*0.92f;
			}
			
			
			// 把计算出来的结果赋值给对象上的toPayFee成员变量
			this.toPayFee = tmp;
			
		}

}
