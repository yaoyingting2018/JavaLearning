package reflect.demo2;

public class UserRegisterServiceImpl implements UserRegisterService{

	@Override
	public boolean checkIfExist(String name) {
		
		return false;
	}

	@Override
	public boolean registerUser(String name, String pwd1, String pwd2) {
		 
		return true;
	}

}

