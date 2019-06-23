package sortutil3;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		// 造数据
		ArrayList<User> uList = new ArrayList<>();
		User u1 = new User("1", "a", 18,2000);
		User u2 = new User("2", "b", 19,3000);
		User u3 = new User("3", "c", 28,1800);
		User u4 = new User("4", "d", 20,2300);
		uList.add(u1);
		uList.add(u2);
		uList.add(u3);
		uList.add(u4);
		
		SortUtil3 sortUtil = new SortUtil3();
		// 我们的框架通过调User的bijiao方法来比大小
		sortUtil.sort(uList);
		
		for(User u:uList) {
			System.out.println(u);
		}
		System.out.println("---------------------------");
		
		// jdk中现成的工具Collections也能这样么干
		// 框架内部通过调用User的compareTo方法来比大小
		Collections.sort(uList);
		for(User u:uList) {
			System.out.println(u);
		}
	}
	
}
