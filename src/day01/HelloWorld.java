package day01;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		//获得工具类的一个对象
		Scanner sc=new Scanner(System.in);
		//调用对象的nextLine方法
		String name=sc.nextLine();
		//字符串拼接
		String res=name+"真美,"+name+"人见人爱！";
		System.out.println(res);
	}

}
