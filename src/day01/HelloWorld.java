package day01;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		// 首先，创建出一个用于获取终端输入的工具Scanner
		Scanner sc=new Scanner(System.in);
		// 先想办法获取用户输入的第一个数字
		String name=sc.nextLine();
		//"Tom".equals(name)
		if(name.equals("Tom")){
			System.out.println("欢迎您,tom");
		}else if (name.equals("Jim")) {
			System.out.println("你好，Jim");			
		}else {
			System.out.println(name+"滚蛋，你在本系统没有权限");
		}		
	}
}
