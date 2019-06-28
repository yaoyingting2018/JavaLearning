package datafind.demo;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;

import org.junit.Test;
public class TestClient {
	@Test
	public void testFindById() throws Exception {
		Socket sc = new Socket("localhost", 1000);
		OutputStream out = sc.getOutputStream();
		
		InputStream in = sc.getInputStream();
		
		out.write("SELECT * FROM p.dat WHERE id=3".getBytes());
		
		byte[] b = new byte[100];
		int num = in.read(b);
		System.out.println(new String(b,0,num));
		
		out.close();
		in.close();
		sc.close();
		
	}
	
	@Test
	public void testFindByName() throws Exception {
		
		Socket sc = new Socket("localhost", 1000);
		OutputStream out = sc.getOutputStream();
		out.write("SELECT * FROM p.dat WHERE name like 菠萝".getBytes());
		
		InputStream in = sc.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(in);
		List<Product> pList = (List<Product>) ois.readObject();
		
		System.out.println(pList);
		
		out.close();
		in.close();
		ois.close();
		sc.close();
		
		
	}
}
