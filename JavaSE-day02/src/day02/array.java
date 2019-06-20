package day02;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		// 造数据
		int[] arr = new int[21];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
      
		// 打印数组中的数据
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------------------------------------");
		int i = 0;
		while (i < arr.length) {
			System.out.println(arr[i]);
			i++;
		}
		System.out.println("-----------------------------------------------");
		i = 9;
		while (i > -1) {
			System.out.println(arr[i]);
			i--;
		}

	}
}
