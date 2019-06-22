package service;
/**
 * 业务层的接口
 * 定义了两个方法： login  、  regist
 * @author ThinkPad
 *
 */
public interface UserSerivce {
public boolean login(String name,String pwd);
	
	
	
	/**
	 * 如果是密码不一致，则返回"1"
	 * 如果是用户名已存在，则返回"2"
	 * 如果注册成功，则返回"3"
	 * @param name
	 * @param pwd1
	 * @param pwd2
	 * @return
	 */
	public String regist(String name,String pwd1,String pwd2);
}
