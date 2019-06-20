package day02;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		// 造数据
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 25;
		arr[3] = 30;
		arr[4] = 18;

		// 实现需求
		// 需求1： 求最大值
		int tmp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > tmp) {
				tmp = arr[i];
			}
		}

		System.out.println("最大值为： " + tmp);

		tmp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < tmp) {
				tmp = arr[i];
			}
		}

		System.out.println("最小值为： " + tmp);
	}
}
