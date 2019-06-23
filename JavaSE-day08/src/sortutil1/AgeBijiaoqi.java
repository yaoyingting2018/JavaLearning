package sortutil1;

public class AgeBijiaoqi implements BijiaoQi {

	@Override
	public boolean bijiao(User u1, User u2) {
		if(u1.getAge()>u2.getAge()) {
			return true;
		}
		return false;
	}

}
