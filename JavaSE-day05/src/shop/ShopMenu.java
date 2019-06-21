package shop;

import java.util.Scanner;

public class ShopMenu {
	public static void main(String[] args) {
		// 构造一个商品池管理器
		ProductManagement pmgmt = new ProductManagement();

		// 利用工具方法来为商品池添加商品数据
		CreateSomeProducts.create(pmgmt);

		// 构造一个购物车管理器
		CartManagement cartMgmt = new CartManagement();

		System.out.println("欢迎您来到小牛商城，请选择您要进行的操作");
		Scanner scanner = new Scanner(System.in);

		boolean flag = true;
		while (flag) {
			System.out.println();
			System.out.println();
			System.out
					.println("1.浏览商品; 2.购物; 3.查看购物车; 4.修改购物车; 5.提交订单;6.付款;7.退出");
			String command = scanner.nextLine();

			switch (command) {

			case "1":
				pmgmt.showProducts();
				break;

			case "2":
				System.out.println("请选择您需要购买的商品，格式如： pdt1:1,pdt2:3");
				String selectPdts = scanner.nextLine();

				cartMgmt.addProdcutToCart(selectPdts, pmgmt);
				break;

			case "3":
				System.out.println("你的购物车你自己看");
				cartMgmt.showCart();
				break;

			case "4":
				System.out.println("现在没空，你自己想办法去修改吧");
				break;

			case "5":
				System.out.println("现在没空，你自己想办法去提交订单吧");
				break;

			case "6":
				System.out.println("再忙我也能收钱");
				break;

			case "7":
				flag = false;
				break;

			default:
				System.out.println("你sb啊你，你不会看菜单啊，没上学啊，不识字啊.....");
				break;

			}

		}

	}

}
