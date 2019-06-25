package filedemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class FileStream {
public static void main(String[] args) throws Exception {
		
		
		
		// 覆盖的方式写数据传入参数true
				FileOutputStream fos = new FileOutputStream("e:/test.txt",false);
				
				String s  = "a你好";
				byte[] bytes = s.getBytes("UTF-8");  // 将字符串按指定编码集编码--》将信息转成二进制数
				fos.write(bytes);  // 这样写入的数据，会将文件中的原数据覆盖
				fos.write(",sb".getBytes("UTF-8"));
				
				
				/**
				 * 第一句和后两句话写到文件中的数据完全相同，写入数字13
				 */
				fos.write("13".getBytes());  // .getBytes()编码的过程
				fos.write((byte)49);
				fos.write((byte)51);
				
				/**
				 * 这两句话写到文件中的数据完全相同，换行
				 */
				fos.write((byte)13);
				fos.write("\r".getBytes());
				fos.close();
				
				// 要读文件，首先要构造一个FileInputStream对象
				InputStream fis = new FileInputStream("e:/test.txt");
				
				
				/**
				 * 把数从文件中读取出来
				 * 如何读取字符
				 */
				// FileInputStream是一种字节流，是按照一个一个字节去文件中取数据的
				// 手动一个字节一个字节地读取
			/*	int read = fis.read();
				
				System.out.println(read);
				
				read = fis.read();
				System.out.println(read);
				
				*//**
				 * 利用fis读到文件末尾后会返回-1的特性，来用循环进行读取
				 *//*
				//int read = 0;
				while((read=fis.read())!=-1) {
					System.out.println(read);
				}*/
				
				System.out.println("-------------------");
				/**
				 * 如果我要读出数据（文本文件中的数据其实就是字符）
				 * 过程是：还是先读数，然后按照码表，将这个数转成字符
				 * 
				 */
			  /*  int read = 0;
				while((read=fis.read())!=-1) {
					// char就代表一个英文字符，而且使用的是ascII码表规则
					char c = (char)read;
					System.out.println(c);
				}*/
				
				
				/**
				 * 一次读取多个字节然后转成某种数据类型
				 * read(buf)方法，一次读取buf长度个字节数据，并且读到的数据直接填入了buf数组中
				 */
				/*byte[] buf = new byte[8];
				int num = fis.read(buf);  // 返回的是真实读到的字节数量
				String string = new String(buf,2,5);  // 利用二进制的byte数组来转成字符串
				System.out.println(string);*/
				
				
				/**
				 * 用while循环来反复读取
				 */
				int num = 0;
				byte[] buf = new byte[8];
				while((num=fis.read(buf))!=-1) {
					System.out.println(new String(buf,0,num));
				}
				
				// 关流
				fis.close();
				
	}

}
