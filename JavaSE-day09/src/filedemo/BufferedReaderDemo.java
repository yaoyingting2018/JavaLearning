package filedemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferedReaderDemo {
	public static void main(String[] args) throws Exception {
		// true表示按追加的方式构造流， utf-8表示编码时所使用的编码集
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("e:/day09.txt",true),"UTF-8"));
				
		bw.write("我爱你，祖国\n");  // \r\n 在windows中是默认的换行符   而linux中默认的换行符：\n
		bw.write("我爱你，contry");
				
		bw.close();
		
		// BufferedReader包装了字节流，并且可以按指定的编码集将字节转成字符
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("e:/day09.txt"),"UTF-8"));
		
		/*String line = br.readLine(); // 按照回车符来判断是否满一行，并用上面指定的编码集来将二进制数据转成字符串
		System.out.println(line);
		
		System.out.println("----------------");*/
		String line ="";
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		
		
		
		
	}
}
