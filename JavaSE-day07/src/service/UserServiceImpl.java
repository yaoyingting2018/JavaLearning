package service;

import dao.UserDao;
import dao.UserDaoImpl;
import pojo.User;

public class UserServiceImpl implements UserSerivce {
	UserDao userDao = new UserDaoImpl();

	@Override
	public boolean login(String name, String pwd) {

		// 调DAO层的功能去查询该用户名是否存在 ——》 传一个用户名，它帮我返回一个用户对象

		User user = userDao.findUserByName(name);
		if (user == null) {
			return false;
		}

		if (user.getPassword().equals(pwd)) {
			return true;
		}

		return false;
	}

	@Override
	public String regist(String name, String pwd1, String pwd2) {
		// 检查两次密码是否一致，如果不一致，直接返回 1
		if (!pwd1.equals(pwd2)) {
			return "1";
		}

		// 调dao层的功能去检查该用户名是否已存在
		boolean ifExist = userDao.checkUserIfExsit(name);

		// 如果用户名已存在，则直接返回 2
		if (ifExist) {
			return "2";
		}

		// 将用户的信息存储到数据库中
		User u = new User();
		u.set(name, pwd1);
		userDao.addUser(u);

		return "3";
	}

}
