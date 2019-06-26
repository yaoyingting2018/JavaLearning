package objectstream.demo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

public class FuzaObjectSerDe {
	@Test
	public  void testList() throws Exception {
		//  将一个list对象直接写入文件
		User user1 = new User("慕容复", 38, 2800, 8000);
		User user2 = new User("扫地僧", 58, 3800, 0);
		
		ArrayList<User> users = new ArrayList<>();
		users.add(user1);
		users.add(user2);
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:/users.list"));
		oos.writeObject(users);
		oos.close();
		
		
		// 从文件中读取一个list对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/users.list"));
		ArrayList<User> userList = (ArrayList<User>) ois.readObject();
		System.out.println(userList);
		
		ois.close();
		
	}
	
	
	/**
	 * 将一个hashmap对象直接写入文件
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@Test
	public void testWriteMap() throws FileNotFoundException, IOException {
		
		HashMap<String, User> users = new HashMap<>();
		
		User user1 = new User("慕容复", 38, 2800, 8000);
		User user2 = new User("扫地僧", 58, 3800, 0);
		users.put(user1.getName(), user1);
		users.put(user2.getName(), user2);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:/users.map"));
		oos.writeObject(users);
		oos.close();
		
	}
	
	
	/**
	 * 直接从文件中读取一个map对象
	 * @throws Exception
	 */
	@Test
	public void testReadMap() throws Exception {
		// 从文件中读取一个list对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/users.map"));
		HashMap<String, User> userMap = (HashMap<String, User>) ois.readObject();
		System.out.println(userMap);
	}
	
	
	/**
	 * 写入一个包含list成员的user对象
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test
	public void testWriteUserWithList() throws FileNotFoundException, IOException {
		
		User user1 = new User("慕容复", 38, 2800, 8000);
		ArrayList<String> friends = new ArrayList<>();
		friends.add("王语嫣");
		friends.add("段誉");
		friends.add("虚竹");
		
		user1.setFriends(friends);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:/murongfu.obj"));
		oos.writeObject(user1);
		oos.close();
		
	}
}
