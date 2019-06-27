package socketdemo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws Exception {
		Socket sc = new Socket("127.0.0.1",1000);
		
		InputStream in = sc.getInputStream();
		OutputStream out = sc.getOutputStream();
		
		// 先发第一个问题
		out.write("你是谁啊?".getBytes());
		
		// 接收第一个问题的答案
		byte[] b = new byte[1024];
		int num = in.read(b);
		System.out.println("第一个问题的答案是： " + new String(b,0,num));
		
		Thread.sleep(10000);  //模拟：有些客户端可能很墨迹
		
		// 发第2个问题
		out.write("你的理想女友是什么样的？".getBytes());
		
		// 接收第2个问题的答案
		num = in.read(b);
		System.out.println("第2个问题的答案是： " + new String(b,0,num));
		
		in.close();
		out.close();
		sc.close();
		
	}
}
