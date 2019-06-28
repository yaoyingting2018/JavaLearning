package datafind.demo;

import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class ReadData {
	/**
	 * 根据id查找商品
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Product findProductById(int id) throws Exception{
		
		// 可以从文件中任何位置开始读数据的工具：RandomAccessFile
		RandomAccessFile raf = new RandomAccessFile("e:/p.dat", "r");
		
		// 读id为2的那个商品的数据
		long pos = id*28;
		
		// 让raf的读取位置跳到指定的pos位置
		raf.seek(pos);
		
		// 然后开始读数据即可
		//  先读4个字节返回一个整数
		int pId = raf.readInt();
		
		// 再读20个字节
		byte[] b = new byte[20];
		int read = raf.read(b);
		// 然后将这20个字节转成字符串，但是尾部有大量空格
		String string = new String(b);
		// 去掉首尾的空格
		String name = string.trim(); 
		
		// 再读价格
		float price = raf.readFloat();
		
		raf.close();
		
		
		Product prodcut = new Product(pId, name, price);
		return prodcut;
	}
	
	
	
	
	/**
	 *  根据名称查找商品
	 * @throws Exception 
	 **/
	
	public List<Product> findProductByName(String keyword) throws Exception {
		
		ArrayList<Product> pList = new ArrayList<>();
		
		// 可以从文件中任何位置开始读数据的工具：RandomAccessFile
		RandomAccessFile raf = new RandomAccessFile("e:/p.dat", "r");
		int i=0;
		while((i+1)*28<=raf.length()) {
			raf.seek(4+28*i);   //将读取位置定位到名称字段的起始位置
			byte[] b = new byte[20];
			raf.read(b);
			String name = new String(b).trim();
			if(name.contains(keyword)) {
				raf.seek(i*28);  // 回到这条数据的起始位置
				int id = raf.readInt();  // 读id数据
				raf.read(b);   // 读名称字段
				float price = raf.readFloat();   // 读价格字段
				pList.add(new Product(id, name, price));  // 将符合条件的这条数据加入list中
			}
			
			i++;
		}
		
		return pList;
	}
	
	
	
	
	
	
	
	/**
	 *  根据价格查找商品
	 **/
	
}
