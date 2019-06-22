package interfacedemo2;

import java.util.Scanner;

import service.UserSerivce;
import service.UserServiceImpl;

public class UserMenu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 定义一个业务组件变量，用它的接口类型来引用
		UserSerivce userManage = new UserServiceImpl();
		boolean flag = true;
		while (flag) {
			System.out.println("1.登录；  2.注册； quit.退出");
			String nextLine = sc.nextLine();
			switch (nextLine) {
			case "1":
				System.out.println("请输入账号：");
				String username = sc.nextLine();
				System.out.println("请输入密码：");
				String pwd = sc.nextLine();

				// 调用业务逻辑组件的登陆方法
				boolean login = userManage.login(username, pwd);
				if (login) {
					System.out.println("恭喜您，登陆成功");
				} else {
					System.out.println("抱歉，您的用户名或密码不正确");
				}
				break;
			case "2":
				System.out.println("请输入用户名：");
				String name = sc.nextLine();
				System.out.println("请输入密码：");
				String pwd1 = sc.nextLine();
				System.out.println("请再次确认密码：");
				String pwd2 = sc.nextLine();

				// 调用业务逻辑组件的注册方法
				String res = userManage.regist(name, pwd1, pwd2);
				switch (res) {
				case "1":
					System.out.println("亲爱的，你有可能两次密码输的不一致");
					break;
				case "2":
					System.out.println("亲爱的，你选的账号太抢手了，换一个吧");
					break;
				case "3":
					System.out.println("亲爱的，你今天开始算是我的人了");
					break;
				default:
					break;

				}
				break;

			case "quit":
				System.out.println("bye......");
				flag = false;
				break;

			}
		}
	}

}
