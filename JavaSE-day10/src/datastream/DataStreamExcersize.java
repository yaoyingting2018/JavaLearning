package datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataStreamExcersize {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User("张三丰", 100, 10000.0f, 300000000);
		User u2 = new User("三毛", 10, 200.0f, 3);
		
		// 将这两个对象的数据写入文件
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("e:/u.dat"));

		dos.writeUTF(u1.getName());
		dos.writeInt(u1.getAge());
		dos.writeFloat(u1.getSalary());
		dos.writeLong(u1.getHairNum());
		
		dos.writeUTF(u2.getName());
		dos.writeInt(u2.getAge());
		dos.writeFloat(u2.getSalary());
		dos.writeLong(u2.getHairNum());
		
		dos.close();
		
		
		// 从文件中读出数据，恢复对象
		DataInputStream dis = new DataInputStream(new FileInputStream("e:/u.dat"));
		String u1_name = dis.readUTF();
		int u1_age = dis.readInt();
		float u1_salary = dis.readFloat();
		long u1_hairNum = dis.readLong();
		
		User user1 = new User(u1_name, u1_age, u1_salary, u1_hairNum);
		User user2 = new User(dis.readUTF(), dis.readInt(), dis.readFloat(), dis.readLong());
		
		System.out.println(user1);
		System.out.println(user2);
		
		dis.close();
	}

}
