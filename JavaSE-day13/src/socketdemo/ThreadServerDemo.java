package socketdemo;

import java.net.ServerSocket;
import java.net.Socket;

public class ThreadServerDemo {
	public static void main(String[] args) throws Exception {

		ServerSocket ss = new ServerSocket(1000);
		int i=1;
		while (true) {
			
			Socket sc = ss.accept();
			System.out.println("收到连接"+i);
			Talk talk = new Talk(sc);
			new Thread(talk).start();
			i++;

		}

	}
}
