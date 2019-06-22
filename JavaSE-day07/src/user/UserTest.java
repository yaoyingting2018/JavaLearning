package user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class UserTest {
	public static void main(String[] args) {
		User u1 = new User("1", "张三1", "111", "1383838438", 18, 1800);
		User u2 = new User("2", "张三2", "111", "1383838438", 28, 2800);
		User u3 = new User("3", "张三3", "111", "1383838438", 38, 1900);
		User u4 = new User("4", "张三4", "111", "1383838438", 20, 3800);

		// 放入数组
		User[] userArr = new User[] { u1, u2, u3, u4 };

		// 放入list
		ArrayList<User> userList = new ArrayList<>();
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);

		// 放入hashset
		HashSet<User> userSet = new HashSet<>();
		userSet.add(u1);
		userSet.add(u2);
		userSet.add(u3);
		userSet.add(u4);

		// 放入hashmap
		HashMap<String, User> userMap = new HashMap<>();
		userMap.put(u1.getId(), u1);
		userMap.put(u2.getId(), u2);
		userMap.put(u3.getId(), u3);
		userMap.put(u4.getId(), u4);

		// 遍历数组
		for (User u : userArr) {
			System.out.println(u);
		}
		System.out.println("--------------------------------");

		// 遍历list
		for (User u : userList) {
			System.out.println(u);
		}
		System.out.println("--------------------------------");

		// 遍历set
		for (User u : userSet) {

			System.out.println(u);
		}
		System.out.println("--------------------------------");

		// 遍历hashmap
		Set<String> keySet = userMap.keySet();
		for (String id : keySet) {
			User u = userMap.get(id);
			System.out.println(u);
		}
		System.out.println("--------------------------------");

		// 遍历hashmap的另一种方法
		Set<Entry<String, User>> entrySet = userMap.entrySet();
		for (Entry<String, User> ent : entrySet) {
			System.out.println(ent.getKey() + " : " + ent.getValue());
		}
	
	
		// 从list中找出年龄最大的user对象
		User u_list = userList.get(0);
		for(int i=1;i<userList.size();i++) {
			if(userList.get(i).getAge() > u_list.getAge()) {
				u_list = userList.get(i);
			}
		}
		System.out.println("年龄最大的用户为： " + u_list);
	
		
		// 从set中找出薪水最高的user对象
		// 由于从set集合中无法直接取出一个数据，所以使用了它的迭代器工具
		Iterator<User> iterator = userSet.iterator();
		User u_set = iterator.next();
		for(User u: userSet) {
			if(u.getSalary() > u_set.getSalary()) {
				u_set = u;
			}
		}
		System.out.println("薪水最高的用户为： " + u_set);
		
		// 从map中找出年龄最小的user对象
		Set<String> keySet2 = userMap.keySet();
		// 由于从set集合中无法直接取出一个数据，所以使用了它的迭代器工具
		Iterator<String> iterator2 = keySet2.iterator();
		String id = iterator2.next();
		
		User u_map = userMap.get(id);
		for(String key:keySet2) {
			User user = userMap.get(key);
			if(user.getAge()<u_map.getAge()) {
				u_map = user;
			}
		}
		
		System.out.println("年龄最小的用户为： " + u_map);
	
	}
}
