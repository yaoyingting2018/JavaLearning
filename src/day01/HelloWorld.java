package day01;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			// ���ȣ�������һ�����ڻ�ȡ�ն�����Ĺ���Scanner
			Scanner sc = new Scanner(System.in);
			// ����취��ȡ�û�����ĵ�һ������
			String num = sc.nextLine();
			int nb = Integer.parseInt(num);
			// "Tom".equals(name)
			if (nb > 8) {
				System.out.println("���µ�̫����");
			} else if (nb < 8) {
				System.out.println("���µ�̫С��");
			} else {
				System.out.println("��ϲ�����¶���");
				flag = false;
			}
		}

	}
}
