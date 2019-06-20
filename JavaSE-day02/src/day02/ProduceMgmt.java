package day02;

public class ProduceMgmt {
	public static void main(String[] args) {
		Product p1=new Product();
		p1.id = "1";
		p1.name = "笔";
		p1.category = "学习用品";
		p1.price = 8.8f;
		
		Product p2=new Product();
		p2.id = "2";
		p2.name = "书";
		p2.category = "学习用品";
		p2.price = 28.8f;
		
		Product p3=new Product();
		p3.id = "3";
		p3.name = "橡皮擦";
		p3.category = "学习用品";
		p3.price = 2.8f;
		// 然后，将这3个商品对象放入一个数组中
		Product[] pdts=new Product[3];
		pdts[0]=p1;
		pdts[1]=p2;
		pdts[2]=p3;
		
		//
		Product tmp=pdts[0];
		for(int i=1;i<pdts.length;i++){
			if(pdts[i].price>tmp.price){
				tmp=pdts[i];
			}
		}
		System.out.println(tmp.id + "," 
		+ tmp.name +","
		+tmp.category +","
		+ tmp.price);
			
	}

}
