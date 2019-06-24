package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class UserTest {
	/**
	 * id, name, age, salary 1,张三,18,2000 2,李四,20,3000 3,王五,19,2500 4,赵六,19,3600
	 * 5,铁蛋,20,2800
	 */
	@Test
	public void test() {

		User u1 = new User("1", "张三", 18, 2000);
		User u2 = new User("2", "李四", 20, 3000);
		User u3 = new User("3", "王五", 19, 2500);
		User u4 = new User("4", "赵六", 27, 3600);
		User u5 = new User("5", "铁蛋", 20, 2800);

		ArrayList<User> users = new ArrayList<>();
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);

		/**
		 * 按年龄排序
		 */
		for (int i = 0; i < users.size() - 1; i++) {
			for (int j = 0; j < users.size() - 1 - i; j++) {
				User userJ = users.get(j);
				User userJ_1 = users.get(j + 1);
				if (userJ.getAge() < userJ_1.getAge()) {
					users.set(j, userJ_1);
					users.set(j + 1, userJ);
				}
			}
		}

		for (User u : users) {
			System.out.println(u);
		}
		System.out.println("-------------------------------");
		/**
		 * 按薪水排序
		 */
		for (int i = 0; i < users.size() - 1; i++) {
			for (int j = 0; j < users.size() - 1 - i; j++) {
				User userJ = users.get(j);
				User userJ_1 = users.get(j + 1);
				if (userJ.getSalary() > userJ_1.getSalary()) {
					users.set(j, userJ_1);
					users.set(j + 1, userJ);
				}
			}
		}

		for (User u : users) {
			System.out.println(u);
		}

		System.out.println("-------------------------------");
		
		
		
		
		/**
		 * 中级题1
		 * 按年龄综合薪水 进行排序
		 */
		for (int i = 0; i < users.size() - 1; i++) {
			for (int j = 0; j < users.size() - 1 - i; j++) {
				User userJ = users.get(j);
				User userJ_1 = users.get(j + 1);
				// 先比年龄，如果前一个的年龄比后一个的年龄大，交换位置
				if (userJ.getAge() > userJ_1.getAge()) {
					users.set(j, userJ_1);
					users.set(j + 1, userJ);
				}

				// 如果前一个的年龄比后一个的年龄相等，再看薪水，如果需要就交换位置
				if (userJ.getAge() == userJ_1.getAge()) {
					if (userJ.getSalary() > userJ_1.getSalary()) {
						users.set(j, userJ_1);
						users.set(j + 1, userJ);
					}

				}

			}
		}

		for (User u : users) {
			System.out.println(u);
		}
		
		
		
		System.out.println("****************************");
		/**
		 * 中级题  2 
		 */
		HashMap<String, User> uMap = new HashMap<>();
		uMap.put(u1.getId(), u1);
		uMap.put(u2.getId(), u2);
		uMap.put(u3.getId(), u3);
		uMap.put(u4.getId(), u4);
		uMap.put(u5.getId(), u5);
		
		ArrayList<User> uList = new ArrayList<>();
		
		
		Set<Entry<String, User>> entrySet = uMap.entrySet();
		for(Entry<String, User> ent:entrySet) {
			User u = ent.getValue();
			if(u.getSalary()>2500) {
				uList.add(u);
			}
		}
		
		for(User u: uList) {
			System.out.println(u);
		}
		

	}
}
