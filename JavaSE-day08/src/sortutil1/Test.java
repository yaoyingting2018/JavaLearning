package sortutil1;

import java.util.ArrayList;

public class Test {
public static void main(String[] args) {
		
		ArrayList<User> uList = new ArrayList<>();
		User u1 = new User("1", "a", 18,2000);
		User u2 = new User("2", "b", 19,3000);
		User u3 = new User("3", "c", 28,1800);
		User u4 = new User("4", "d", 20,2300);
		uList.add(u1);
		uList.add(u2);
		uList.add(u3);
		uList.add(u4);
		
		// 专门新建一个比较器实现类，然后new出来传进去
		SortUtil.sort(uList, new AgeBijiaoqi());
		for(User u:uList){
			System.out.println(u);
		}
		System.out.println("--------------------------");
		// 或者使用匿名内部类来传递具体的比较器对象
		SortUtil.sort(uList, new BijiaoQi() {
			
			@Override
			public boolean bijiao(User u1, User u2) {
				if(u1.getSalary() > u2.getSalary()) {
					return true;
				}
				return false;
			}
		});
		for(User u:uList){
			System.out.println(u);
		}
	}

}
