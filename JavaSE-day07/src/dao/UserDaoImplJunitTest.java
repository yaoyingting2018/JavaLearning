package dao;

import org.junit.Test;

import pojo.User;

public class UserDaoImplJunitTest {
	@Test   // 要运行哪个测试方法，就在这个方法上添加@Test注解，然后在方法名上点右键，选run as-->Junit
	public void testAdd() {
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		User u2 = new User();
		u2.set("lisi", "123");
		
		userDaoImpl.addUser(u2);
		
		boolean ex = userDaoImpl.checkUserIfExsit("lisi");
		System.out.println(ex);
		
	}
	
	
	@Test
	public void testFind() {
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		
		User xx = userDaoImpl.findUserByName("aaa");
		System.out.println(xx.getPassword());
		
	}

}
