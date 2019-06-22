package dao;

import pojo.User;

public interface UserDao {
	public User findUserByName(String userName);

	public boolean checkUserIfExsit(String userName);

	public void addUser(User user);
}
