package day01;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		// ���ȣ�������һ�����ڻ�ȡ�ն�����Ĺ���Scanner
		Scanner sc=new Scanner(System.in);
		// ����취��ȡ�û�����ĵ�һ������
		String name=sc.nextLine();
		//"Tom".equals(name)
		if(name.equals("Tom")){
			System.out.println("��ӭ��,tom");
		}else if (name.equals("Jim")) {
			System.out.println("��ã�Jim");			
		}else {
			System.out.println(name+"���������ڱ�ϵͳû��Ȩ��");
		}		
	}
}
