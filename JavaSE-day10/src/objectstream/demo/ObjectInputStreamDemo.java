package objectstream.demo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
	public static void main(String[] args) throws Exception {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/u.obj"));

		User readObject1 = (User) ois.readObject();
		User readObject2 = (User) ois.readObject();

		System.out.println(readObject1);
		System.out.println(readObject2);

		ois.close();
	}
}
