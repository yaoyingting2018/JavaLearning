package day02;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// �����������,��������Ͷ�����һ������װfloat���ݵ����飬����Ϊ5
	    float[] scoreArr = new float[5];
	    int i;
	    for(i=0;i<5;i++) {
			System.out.println("������ɼ���");
			String line = sc.nextLine();
			// ��һ������װ��������ָ���ĸ��ӣ��ڼ�������λ�ã�
			scoreArr[i] = Float.parseFloat(line);
			
		}
		
		// �����ܳɼ�
		float sum = 0;
		for(i=0;i<5;i++) {
			sum += scoreArr[i];
		}
		
		System.out.println("�ܳɼ�Ϊ��" + sum);
		System.out.println("ƽ���ɼ�Ϊ��" + sum/5);		
		
	}
}
