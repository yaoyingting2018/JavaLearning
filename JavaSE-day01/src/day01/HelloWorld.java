package day01;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			// 首先，创建出一个用于获取终端输入的工具Scanner
			Scanner sc = new Scanner(System.in);
			// 先想办法获取用户输入的第一个数字
			String num = sc.nextLine();
			int nb = Integer.parseInt(num);
			// "Tom".equals(name)
			if (nb > 8) {
				System.out.println("您猜得太大了");
			} else if (nb < 8) {
				System.out.println("您猜得太小了");
			} else {
				System.out.println("恭喜您，猜对了");
				flag = false;
			}
		}

	}
}
