package cn.edu360.javase24.day14.demo;

/**
 * ��ά����
 * @author ThinkPad
 *
 */
public class MultiDementionArray {
	
	
	public static void main(String[] args) {
		int[] arrOne = new int[3];  // ����һ��1ά����
		arrOne[0] = 1;   // 1ά����ĵ�0��Ԫ�ظ�ֵΪһ������1
		arrOne[1] = 2;
		arrOne[2] = 3;
		
		int[][] arrTwo = new int[3][4];  // ����һ��2ά���飬��Χ����Ϊ3�������ÿ�����鳤��Ϊ4
		
		arrTwo[0][0] = 1;   // ����ά����arrTwo�ĵ�0������ĵ�0��Ԫ�ظ�ֵΪ����1
		arrTwo[0][1] = 2;
		
		arrTwo[1][2] = 6;  // ����ά����arrTwo�ĵ�1������ĵ�2��Ԫ�ظ�ֵΪ����6
		
		int[] tmp = {5,5,5,5};
		arrTwo[2] = tmp;   // ����ά����arrTwo�ĵ�2�����鸳ֵΪtmp����
		
		
		
		int[][] arr3 = new int[3][];   // ����һ��2ά���飬��Χ����Ϊ3����������鳤�Ȳ���
		
		
		int[][] arr4 = {{1,2,3,4},{5,6},{7,8,9}}; //����һ��2ά���飬����ֱ�Ӹ���ֵ����ֵ��3������
		int a = arr4.length;       // 3
		int b = arr4[0].length;   //  4
		
		/**
		 * ����2ά����
		 */
		for(int i=0;i<arr4.length;i++) {
			for(int j=0;j<arr4[i].length;j++) {
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
