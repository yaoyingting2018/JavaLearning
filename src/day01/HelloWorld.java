package day01;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		//��ù������һ������
		Scanner sc=new Scanner(System.in);
		//���ö����nextLine����
		String name=sc.nextLine();
		//�ַ���ƴ��
		String res=name+"����,"+name+"�˼��˰���";
		System.out.println(res);
	}

}
