package cn.edu360.javase24.day14.demo;

public class ContinueBreak {

	public static void main(String[] args) {
		
		// 打印1-10之间的奇数，但是如果碰到7，就中止了
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
			
			if(i==3) {
				continue;   // 本轮循环直接完成
			}
			
			System.out.println("哈哈");
			
			if(i==7) {
				break;   // 跳出整个循环
			}
			
		}
		
		System.out.println("hah");
	}
	
	
}
