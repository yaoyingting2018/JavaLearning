package datafind.demo;

import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;

public class FindDataRunnable implements Runnable {

	Socket sc;
	ReadData readData;

	public FindDataRunnable(Socket sc,ReadData readData) {
		this.sc = sc;
		this.readData = readData;
	}

	@Override
	public void run() {
		try {
			InputStream in = sc.getInputStream();
			OutputStream out = sc.getOutputStream();
			
			ObjectOutputStream oos = new ObjectOutputStream(out);
			
			/**
			 * 客户端发过来的请求有两种情况：
			 * 1、SELECT * FROM p.dat WHERE id=3       //  想根据id查询商品数据
			 * 2、SELECT * FROM p.dat WHERE name like 菠萝   // 根据名称关键字查询商品数据
			 */
			byte[] b = new byte[1024];
			int num = in.read(b);
			
			String command = new String(b,0,num);
			if(command.contains("id")) {
				//  根据id去帮用户查找商品
				String idStr = command.substring(command.indexOf("=")+1);
				int id = Integer.parseInt(idStr);
				Product p = readData.findProductById(id);
				String a = p.getId() + ","+ p.getName() + "," + p.getPrice();
				
				out.write(a.getBytes("UTF-8"));
				out.close();
				sc.close();
			}else {
				// 根据名称关键字去查找商品
				String[] split = command.split(" ");
				String keyWord = split[split.length-1];
				
				List<Product> pList = readData.findProductByName(keyWord);
				
				// 返回数据给客户端
				oos.writeObject(pList);
				// TODO
				out.close();
				oos.close();
				in.close();
				sc.close();
			}

		} catch (Exception e) {

		}

	}

}
