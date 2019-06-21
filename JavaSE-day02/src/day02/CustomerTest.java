package day02;

import java.util.Scanner;

public class CustomerTest {
	public static void main(String[] args) {

		// �����û����ն��������Ϣ
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������1���ͻ�����Ϣ��");
		String line1 = scanner.nextLine(); // 1,zhangsan,18,male,1383838338,����
		// �ַ����и�
		String[] split1 = line1.split(",");

		System.out.println("�������2���ͻ�����Ϣ��");
		String line2 = scanner.nextLine();
		String[] split2 = line2.split(",");

		System.out.println("�������3���ͻ�����Ϣ��");
		String line3 = scanner.nextLine();
		String[] split3 = line3.split(",");

		// ����3������
		Customer c1 = new Customer(split1[0], split1[1],
				Integer.parseInt(split1[2]), split1[3], split1[4], split1[5]);
		Customer c2 = new Customer(split2[0], split2[1],
				Integer.parseInt(split2[2]), split2[3], split2[4], split2[5]);
		Customer c3 = new Customer(split3[0], split3[1],
				Integer.parseInt(split3[2]), split3[3], split3[4], split3[5]);

		// ���ƽ������
		int sum = c1.age + c2.age + c3.age;
		float avg = (float) sum / 3;

		Customer[] cs = new Customer[] { c1, c2, c3 };

		// ���������
		int tmp = cs[0].age;
		for (int i = 1; i < 3; i++) {
			if (cs[i].age > tmp) {
				tmp = cs[i].age;
			}
		}

		System.out.println("ƽ������Ϊ�� " + avg);
		System.out.println("�������Ϊ�� " + tmp);

	}

}
