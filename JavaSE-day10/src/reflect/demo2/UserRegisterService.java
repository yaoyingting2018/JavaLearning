package reflect.demo2;

public interface UserRegisterService {
	public boolean checkIfExist(String name);
	
	public boolean registerUser(String name,String pwd1,String pwd2);
	
}
