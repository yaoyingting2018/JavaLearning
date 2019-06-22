package interfacedemo2;
import java.util.HashMap;

import pojo.User;

public class UserDatabase {
	public static HashMap<String, User> userMap = new HashMap<>();

	/**
	 * 此类在被jvm加载时，静态代码块就会执行
	 */
	static {

		User u1 = new User();
		u1.set("aaa", "123");

		User u2 = new User();
		u2.set("bbb", "123");

		userMap.put(u1.getUserName(), u1);
		userMap.put(u2.getUserName(), u2);
	}

}
