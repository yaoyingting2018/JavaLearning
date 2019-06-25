package exception;

import java.util.Scanner;

public class IndexOutOfBoundDemo {
	public static void main(String[] args) {

		/*
		 * int[] arr = new int[5]; arr[6] = 10;
		 */

		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("亲，请输入你想要获取的数据的脚标");
			String index = scanner.nextLine();

			int[] arr = new int[] { 2, 3, 4, 5, 6 };
			ListTool listTool = new ListTool();

			try {
				int intFromArr = listTool.getIntFromArr(arr, index);
				System.out.println("您要的数据是： " + intFromArr);

			} catch (Exception e) {
				//
				System.out.println("妈呀，踩雷了，但是没事，俺是金刚不坏之身");
			}

			// 程序后续还有很多代码
			User u1 = new User();
			u1.setAge(18);
			System.out.println(u1.getAge());

		}
	}
}
