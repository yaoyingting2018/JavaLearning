package cn.edu360.javase24.day14.demo;

public class ContinueBreak {

	public static void main(String[] args) {
		
		// ��ӡ1-10֮��������������������7������ֹ��
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
			
			if(i==3) {
				continue;   // ����ѭ��ֱ�����
			}
			
			System.out.println("����");
			
			if(i==7) {
				break;   // ��������ѭ��
			}
			
		}
		
		System.out.println("hah");
	}
	
	
}
