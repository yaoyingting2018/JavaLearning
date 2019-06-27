package socketdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(1000);
		int i = 1;
		while(true) {
			
			Socket sc = ss.accept();
			System.out.println("获得第"+i+"次连接了.....");
			
			InputStream in = sc.getInputStream();
			OutputStream out = sc.getOutputStream();
			
			// 收客户端的第一个问题
			byte[] b = new byte[1024];
			int num = in.read(b);
			System.out.println("收到客户端的第1个问题： " + new String(b,0,num));
			
			// 回答第一个问题
			out.write("我是宇宙无敌大美男".getBytes());
			
			
			// 接收第二个问题
			num = in.read(b);
			System.out.println("收到客户端的第2个问题： " + new String(b,0,num));
			
			
			// 回答第2个问题
			out.write("我的理想女友是按住拉败笔".getBytes());
			
			in.close();
			out.close();
			sc.close();
			i++;
		}
	}

}
