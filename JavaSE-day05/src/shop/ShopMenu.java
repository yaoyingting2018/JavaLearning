package shop;

import java.util.Scanner;

public class ShopMenu {
	public static void main(String[] args) {
		// ����һ����Ʒ�ع�����
		ProductManagement pmgmt = new ProductManagement();

		// ���ù��߷�����Ϊ��Ʒ�������Ʒ����
		CreateSomeProducts.create(pmgmt);

		// ����һ�����ﳵ������
		CartManagement cartMgmt = new CartManagement();

		System.out.println("��ӭ������Сţ�̳ǣ���ѡ����Ҫ���еĲ���");
		Scanner scanner = new Scanner(System.in);

		boolean flag = true;
		while (flag) {
			System.out.println();
			System.out.println();
			System.out
					.println("1.�����Ʒ; 2.����; 3.�鿴���ﳵ; 4.�޸Ĺ��ﳵ; 5.�ύ����;6.����;7.�˳�");
			String command = scanner.nextLine();

			switch (command) {

			case "1":
				pmgmt.showProducts();
				break;

			case "2":
				System.out.println("��ѡ������Ҫ�������Ʒ����ʽ�磺 pdt1:1,pdt2:3");
				String selectPdts = scanner.nextLine();

				cartMgmt.addProdcutToCart(selectPdts, pmgmt);
				break;

			case "3":
				System.out.println("��Ĺ��ﳵ���Լ���");
				cartMgmt.showCart();
				break;

			case "4":
				System.out.println("����û�գ����Լ���취ȥ�޸İ�");
				break;

			case "5":
				System.out.println("����û�գ����Լ���취ȥ�ύ������");
				break;

			case "6":
				System.out.println("��æ��Ҳ����Ǯ");
				break;

			case "7":
				flag = false;
				break;

			default:
				System.out.println("��sb���㣬�㲻�ῴ�˵�����û��ѧ������ʶ�ְ�.....");
				break;

			}

		}

	}

}
