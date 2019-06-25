package datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("e:/p.dat"));
		
		// 写入一个整数  4个字节
		int age = 18;
		dos.writeInt(age);
		
		// 写一个long   8个字节
		dos.writeLong(19929);
		
		// 写一个float数据  4个字节
		dos.writeFloat(18.8f);
		
		// 写一个double数据  8个字节
		dos.writeDouble(18.8);
		
		// 写一个boolean值，true其实写入了一个1 ，false其实写入了一个0
		dos.writeBoolean(true);
		
		// writeutf在写真正的数据的同时，会在前面加上2个字节的长度记录
		dos.writeUTF("张铁林");
		dos.writeInt(48);		
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("e:/p.dat"));
		
		age = dis.readInt();
		long readLong = dis.readLong();
		float readFloat = dis.readFloat();
		
		double readDouble = dis.readDouble();
		
		boolean readBoolean = dis.readBoolean();
		System.out.println(age+","+readLong+","+readFloat+","+readDouble);
		//String readUTF = dis.readUTF();
		
		String name = dis.readUTF();
		age = dis.readInt();
		System.out.println(name);
		System.out.println(age);
		Integer.parseInt("1");
		
		
	}

}
