package day02;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		// ������
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 25;
		arr[3] = 30;
		arr[4] = 18;

		// ʵ������
		// ����1�� �����ֵ
		int tmp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > tmp) {
				tmp = arr[i];
			}
		}

		System.out.println("���ֵΪ�� " + tmp);

		tmp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < tmp) {
				tmp = arr[i];
			}
		}

		System.out.println("��СֵΪ�� " + tmp);
	}
}
