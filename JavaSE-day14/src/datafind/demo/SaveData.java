package datafind.demo;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class SaveData {
	public static void main(String[] args) throws Exception {
		
		Product p0 = new Product(0, "苹果", 10.5f);
		Product p1 = new Product(1, "泰国榴莲", 16.5f);
		Product p2 = new Product(2, "菠萝", 20.5f);
		Product p3 = new Product(3, "菠萝蜜", 30.5f);
		Product p4 = new Product(4, "香蕉", 19.5f);
		
		save(p0);
		save(p1);
		save(p2);
		save(p3);
		save(p4);
		
	}
	
	public static void save(Product p) throws Exception {
		
		// 将数据按照既定的规则存入文件中
		// id占4个字节，name占20字节，price占4个字节
		DataOutputStream dout = new DataOutputStream(new FileOutputStream("e:/p.dat",true));
		
		dout.writeInt(p.getId()); //写入id
		
		byte[] bytes = p.getName().getBytes();
		byte[] b = new byte[20];
		// jdk提供的数组拷贝工具方法： 参数1：源数据数组  参数2：从源数组的第几个位置开始拷贝
		// 参数3 ：目标数组   参数4：目标数组中放数据的起始位置  参数5：拷贝的长度
		System.arraycopy(bytes, 0, b, 0, bytes.length);
		dout.write(b);  // 将商品名写入文件，占20个字节
		
		dout.writeFloat(p.getPrice());  //将价格按照float数写入文件，占4个字节
		
		dout.close();
		
	}
}
