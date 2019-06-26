package shop.user.test;

import java.util.List;

import org.junit.Test;

import shop.constant.UserVipLevelConstant;
import shop.user.dao.UserDaoImpl;
import shop.user.pojo.User;

public class DaoTest {
	@Test
	public void testAddUser() throws Exception {
		
		User u1 = new User("lovebaby1", "123", "杨小颖", 23, UserVipLevelConstant.VIP_1, "13813838338", "北京");
		User u2 = new User("lovebaby2", "123", "杨大颖", 24, UserVipLevelConstant.VIP_1, "13813838338", "北京");
		User u3 = new User("lovebaby3", "123", "杨老颖", 33, UserVipLevelConstant.VIP_1, "13813838338", "北京");
		User u4 = new User("lovebaby4", "123", "杨嫩颖", 16, UserVipLevelConstant.VIP_1, "13813838338", "北京");
		User u5 = new User("lovebaby5", "123", "杨粗颖", 14, UserVipLevelConstant.VIP_1, "13813838338", "北京");
		
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		userDaoImpl.addUser(u1);
		userDaoImpl.addUser(u2);
		userDaoImpl.addUser(u3);
		userDaoImpl.addUser(u4);
		userDaoImpl.addUser(u5);
		
	}
	
	@Test
	public void testGetUserByAgeRange() throws Exception {
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		List<User> userList = userDaoImpl.getUserByAgeRange(33, 23);
		System.out.println(userList);
	}
}
