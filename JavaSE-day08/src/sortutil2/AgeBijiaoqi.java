package sortutil2;


public class AgeBijiaoqi implements BijiaoQi<User> {

	@Override
	public boolean bijiao(User u1, User u2) {
		if(u1.getAge()>u2.getAge()) {
			return true;
		}
		return false;
	}

}
