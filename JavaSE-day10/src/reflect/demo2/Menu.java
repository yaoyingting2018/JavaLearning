package reflect.demo2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		
		// 从约定的文件中读取service层实现类的类全名
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("f:/a.txt")));
		String serviceClassName = br.readLine();
		
		Class<?> forName = Class.forName(serviceClassName); // forName代表的是serviceClassName字符串所指定的类的类class模板
		
		// 根据类全名构造这个service实现类的实例
		UserRegisterService registerService = (UserRegisterService) forName.newInstance();
		
		System.out.println("1.登陆  2.注册");
		boolean flag  = true;
		while(flag) {
			
			String select = scanner.nextLine();
			switch(select) {
			case "1":
				break;
			case "2":
				System.out.println("请输入账户");
				String name = scanner.nextLine();
				System.out.println("请输入密码");
				String pwd1 = scanner.nextLine();
				System.out.println("请再次输入密码");
				String pwd2 = scanner.nextLine();
				
				boolean checkIfExist = registerService.checkIfExist(name);
				if(checkIfExist) {
					System.out.println("用户名已存在");
					break;
				}
				
				boolean registerUser = registerService.registerUser(name, pwd1, pwd2);
				if(registerUser) {
					System.out.println("注册成功");
					break;
				}
				break;
			
			}
		}
	}
}
