package day01;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		// 首先，创建出一个用于获取终端输入的工具Scanner
		Scanner sc=new Scanner(System.in);
		// 先想办法获取用户输入的第一个数字
		String number1=sc.nextLine();
		// 利用另一个工具，将阿拉伯数字字符串 转成数学意义上的整数
		int nb1=Integer.parseInt(number1);
		
		String number2=sc.nextLine();
		int nb2=Integer.parseInt(number2);
		
		int add=nb1+nb2;
		int subtract=nb1-nb2;
		int multiply=nb1*nb2;
		 // float这种类型可以表示小数，精度比整数要高,小数点后8位
		float divide=(float)nb1/nb2;
		//小数点后16位
		double divide1=(double)nb1/nb2;
		System.out.println("相加的结果为："+add);
		System.out.println("相减的结果为："+subtract);
		System.out.println("相乘的结果为："+multiply);
		System.out.println("相除的结果为："+divide);
		System.out.println("相除的结果为："+divide1);
	}

}
