package datafind.demo;

import java.io.RandomAccessFile;

public class ReadData {
	/**
	 * 根据id查找商品
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Prodcut findProductById(int id) throws Exception{
		
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
		
		
		Prodcut prodcut = new Prodcut(pId, name, price);
		return prodcut;
	}
	
	/**
	 *  根据名称查找商品
	 **/
	
	
	
	/**
	 *  根据价格查找商品
	 **/
	
}
