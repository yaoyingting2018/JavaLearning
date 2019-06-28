package cn.edu360.javase24.day14.demo;

/**
 * 多维数组
 * @author ThinkPad
 *
 */
public class MultiDementionArray {
	
	
	public static void main(String[] args) {
		int[] arrOne = new int[3];  // 定义一个1维数组
		arrOne[0] = 1;   // 1维数组的第0个元素赋值为一个整数1
		arrOne[1] = 2;
		arrOne[2] = 3;
		
		int[][] arrTwo = new int[3][4];  // 定义一个2维数组，外围长度为3，里面的每个数组长度为4
		
		arrTwo[0][0] = 1;   // 将二维数组arrTwo的第0个数组的第0个元素赋值为整数1
		arrTwo[0][1] = 2;
		
		arrTwo[1][2] = 6;  // 将二维数组arrTwo的第1个数组的第2个元素赋值为整数6
		
		int[] tmp = {5,5,5,5};
		arrTwo[2] = tmp;   // 将二维数组arrTwo的第2个数组赋值为tmp数组
		
		
		
		int[][] arr3 = new int[3][];   // 定义一个2维数组，外围长度为3，里面的数组长度不定
		
		
		int[][] arr4 = {{1,2,3,4},{5,6},{7,8,9}}; //定义一个2维数组，并且直接赋初值，初值是3个数组
		int a = arr4.length;       // 3
		int b = arr4[0].length;   //  4
		
		/**
		 * 遍历2维数组
		 */
		for(int i=0;i<arr4.length;i++) {
			for(int j=0;j<arr4[i].length;j++) {
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
