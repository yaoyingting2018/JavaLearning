package shop.user.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import shop.constant.DataBasePathConstant;
import shop.user.pojo.User;
import shop.utils.FileOperateUtil;

public class UserDaoImpl implements UserDao{
	FileOperateUtil<User> util = new FileOperateUtil<User>();
	@Override
	public boolean addUser(User user) throws Exception {
		// 取出整个user数据库
		HashMap<String, User> userMap = null;
		File file = new File(DataBasePathConstant.USER_DATA_PATH);
		if (file.exists()) {
			userMap = util.readMapFromFile(DataBasePathConstant.USER_DATA_PATH);
		}else {
			userMap = new HashMap<>();
		}

		// 然后把新用户添加到userMap中
		userMap.put(user.getAccount(), user);

		// 然后将整个userMap数据写入文件
		util.saveMapToFile(userMap,DataBasePathConstant.USER_DATA_PATH);

		return true;
	}

	@Override
	public boolean removeUser(String account) throws Exception {
		// 先加载整个user数据库
		HashMap<String, User> userMap =util.readMapFromFile(DataBasePathConstant.USER_DATA_PATH);
		
		User remove = userMap.remove(account);
		if(remove==null) {
			return false;
		}
		
		// 然后将整个userMap数据写入文件
		util.saveMapToFile(userMap,DataBasePathConstant.USER_DATA_PATH);
		
		return true;
	}

	@Override
	public boolean updateUser(User user) throws Exception {
		// 先加载整个user数据库
		HashMap<String, User> userMap =util.readMapFromFile(DataBasePathConstant.USER_DATA_PATH);
		
		userMap.put(user.getAccount(), user);
		
		// 然后将整个userMap数据写入文件
		util.saveMapToFile(userMap,DataBasePathConstant.USER_DATA_PATH);
		
		return true;
	}

	/**
	 * 根据指定的账号查询出一个用户
	 * 
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	@Override
	public User getUserByAccount(String account) throws Exception {

		// 取出整个user数据库
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DataBasePathConstant.USER_DATA_PATH));
		@SuppressWarnings("unchecked")
		HashMap<String, User> userMap = (HashMap<String, User>) ois.readObject();
		ois.close();

		return userMap.get(account);
	}

	@Override
	public List<User> getUserByAgeRange(int maxAge, int minAge) throws Exception {
		ArrayList<User> userList = new ArrayList<>();
		
		// 先加载整个user数据库
		HashMap<String, User> userMap =util.readMapFromFile(DataBasePathConstant.USER_DATA_PATH);
		Collection<User> users = userMap.values();
		for(User u:users) {
			if(u.getAge()>=minAge && u.getAge()<=maxAge) {
				userList.add(u);
			}
		}
		
		return userList;
	}

	@Override
	public List<User> getUserByVipRange(int maxVip, int minVip) throws Exception {
		ArrayList<User> userList = new ArrayList<>();
		
		// 先加载整个user数据库
		HashMap<String, User> userMap =util.readMapFromFile(DataBasePathConstant.USER_DATA_PATH);
		Collection<User> users = userMap.values();
		for(User u:users) {
			if(u.getVipLevel() >= minVip && u.getVipLevel() <= maxVip) {
				userList.add(u);
			}
		}
		return userList;
	}

	@Override
	public List<User> getUserByName(String name) throws Exception {
		ArrayList<User> userList = new ArrayList<>();
		
		// 先加载整个user数据库
		HashMap<String, User> userMap =util.readMapFromFile(DataBasePathConstant.USER_DATA_PATH);
		Collection<User> users = userMap.values();
		for(User u:users) {
			if(u.getName().contains(name)) {
				userList.add(u);
			}
		}
		return userList;
	}

}
