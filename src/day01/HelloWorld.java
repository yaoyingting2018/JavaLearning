package day01;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		// ���ȣ�������һ�����ڻ�ȡ�ն�����Ĺ���Scanner
		Scanner sc=new Scanner(System.in);
		// ����취��ȡ�û�����ĵ�һ������
		String number1=sc.nextLine();
		// ������һ�����ߣ��������������ַ��� ת����ѧ�����ϵ�����
		int nb1=Integer.parseInt(number1);
		
		String number2=sc.nextLine();
		int nb2=Integer.parseInt(number2);
		
		int add=nb1+nb2;
		int subtract=nb1-nb2;
		int multiply=nb1*nb2;
		 // float�������Ϳ��Ա�ʾС�������ȱ�����Ҫ��,С�����8λ
		float divide=(float)nb1/nb2;
		//С�����16λ
		double divide1=(double)nb1/nb2;
		System.out.println("��ӵĽ��Ϊ��"+add);
		System.out.println("����Ľ��Ϊ��"+subtract);
		System.out.println("��˵Ľ��Ϊ��"+multiply);
		System.out.println("����Ľ��Ϊ��"+divide);
		System.out.println("����Ľ��Ϊ��"+divide1);
	}

}
