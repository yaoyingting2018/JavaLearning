package filedemo;

import java.io.FileInputStream;
/**
 * 利用FileInputStream来按行读取
 * 思想是：如果遇到回车符，则知道满了一行
 * @author ThinkPad
 *
 */
public class MyReadLine {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("e:/day09.txt");
		
		int read=0;
		byte[] buf = new byte[1024];
		
		int i=0;
		while((read=fis.read())!=-1) {
			if(read==13) { // 判断当前读到的字节是否是ascii码中的回车符，如果是，则跳出循环
				break;
			}
			buf[i] = (byte)read;  // 如果不是回车符，则将读取到的一个字节放入buf字节数组中攒起来
			i++;
		}
		
		// 最后，将攒好的一行数据转成字符串 ，打印输出
		System.out.println(new String(buf,0,i));
		
		fis.close();
	}
}
