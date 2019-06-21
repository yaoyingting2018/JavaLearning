package day04;

import java.util.ArrayList;

public class Order {
	// ����id
		public String orderId;
		
		// ���������û����û�����
		public User user;
		
		// ��������������Ʒ
		public ArrayList<Product> pdts;
		
		// �����ܽ��
		public float amountFee;
		
		// ����Ӧ�����
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
			
			// �����ܽ����д���
			if(this.amountFee >=1000 && this.amountFee <2000) {
				tmp = this.amountFee * 0.98f;
			}
			
			if(this.amountFee >=2000 && this.amountFee <3000) {
				tmp = this.amountFee * 0.95f;
				
			}

			if(this.amountFee >= 3000){
				tmp = this.amountFee * 0.90f;
				
			}

			// �����û�vip�ȼ�����
			if(user.vipLevel.equals("�ƽ�vip")) {
				tmp = tmp*0.98f;
			}
			
			if(user.vipLevel.equals("��ʯvip")) {
				tmp = tmp*0.96f;
			}
			
			if(user.vipLevel.equals("����vip")) {
				tmp = tmp*0.92f;
			}
			
			
			// �Ѽ�������Ľ����ֵ�������ϵ�toPayFee��Ա����
			this.toPayFee = tmp;
			
		}

}
