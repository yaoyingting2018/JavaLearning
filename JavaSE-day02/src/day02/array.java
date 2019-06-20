package day02;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// 数组变量定义,下面的语句就定义了一个用来装float数据的数组，长度为5
	    float[] scoreArr = new float[5];
	    int i;
	    for(i=0;i<5;i++) {
			System.out.println("请输入成绩：");
			String line = sc.nextLine();
			// 将一个数据装入数组中指定的格子（第几个索引位置）
			scoreArr[i] = Float.parseFloat(line);
			
		}
		
		// 计算总成绩
		float sum = 0;
		for(i=0;i<5;i++) {
			sum += scoreArr[i];
		}
		
		System.out.println("总成绩为：" + sum);
		System.out.println("平均成绩为：" + sum/5);		
		
	}
}
