package datafind.demo;

import java.net.ServerSocket;
import java.net.Socket;

public class NewBiDbServer {
	public static void main(String[] args) throws Exception {

		ServerSocket ss = new ServerSocket(1000);
		ReadData readData = new ReadData();

		while (true) {
			Socket sc = ss.accept();
			new Thread(new FindDataRunnable(sc,readData)).start();

		}

	}
}
