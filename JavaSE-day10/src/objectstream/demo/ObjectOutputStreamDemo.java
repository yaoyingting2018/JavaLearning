package objectstream.demo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws Exception {

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:/u.obj"));
		
		User user1 = new User("慕容复", 38, 2800, 8000);
		User user2 = new User("扫地僧", 58, 3800, 0);
		// writeObject(user)方法，要求user对象是可序列化的
		oos.writeObject(user1);
		oos.writeObject(user2);
		
		oos.close();

	}

}
