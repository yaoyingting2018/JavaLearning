package filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		
		// 将路径描述成File对象
		File file = new File("e:/pic/aa/bb");
		boolean exists = file.exists();   //　如果路径所表示的文件或者文件夹存在，则返回true
		System.out.println(exists);
		// 判断该file是文件夹还是文件
		boolean directory = file.isDirectory();
		System.out.println(directory);   // true
		
		boolean ifFile = file.isFile();
		System.out.println(ifFile);  // false
		
		// 获取文件的绝对路径
		String absolutePath = file.getAbsolutePath();
		System.out.println(absolutePath);
		
		// 可以获取文件名或文件夹名
		String name2 = file.getName();
		System.out.println(name2);
		
		
		File file2 = new File("e:/pic/1.jpg");
		ifFile  = file2.isFile();  // true
		
		// 获取文件名
		String name = file2.getName();
		System.out.println(name);
		
		// 获取上一级目录的file对象
		File parentFile = file2.getParentFile();
		System.out.println(parentFile.getAbsolutePath());
		
		// 获取上一级目录的路径字符串
		String parent = file2.getParent();
		System.out.println(parent);
		
		
		// 获取文件长度 字节(8个bit-- 二进制位)
		long length = file2.length();
		System.out.println(length);
		
		System.out.println("------------------------");
	
		// 获取指定目录下的子节点的名称字符串
		String[] list = file.list();
		for(String s:list) {
			System.out.println(s);
		}
		
		System.out.println("------------------------");
		
		// 获取指定目录下的子节点的File描述对象
		File[] listFiles = file.listFiles();
		for(File f:listFiles) {
			System.out.println(f.getAbsolutePath());
		}
		
		
		// 创建一个文件夹
		File f = new File("d:/xx/yy");
		boolean mkdir = f.mkdir(); // 不能创建多级目录
		System.out.println(mkdir);
		
		boolean mkdirs = f.mkdirs();  // 可以创建多级目录
		System.out.println(mkdirs);
		
		
		// 创建文件
		File file3 = new File("d:/xx/yy/cls.avi");
		boolean createNewFile = file3.createNewFile();
		System.out.println(createNewFile);
		
		// 重命名文件：其实可以把路径都给改了
		file3.renameTo(new File("d:/xx/yy/bdls.avi"));
		
		// 删除文件
		boolean delete = file3.delete();
		System.out.println(delete);
		
		
		
	}

}
