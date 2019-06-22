package construct;

import java.util.HashMap;
/**
 * 实现类通过implements关键字来跟接口建立联系
 * 那么，在这个实现类中，就必须将接口中定义的方法全部实现
 * 另外，在接口方法以外，也可以写额外的方法
 * @author ThinkPad
 *
 */
public class XXServiceImpl implements XXService {
	String id;
	/** 接口中定义的方法，必须实现  **/
	@Override
	public String step1() {
		// TODO Auto-generated method stub
		return "step1";
	}

	@Override
	public void step2(String id) {
		// TODO Auto-generated method stub
		System.out.println("step2");
	}

	@Override
	public HashMap<String, Integer> step3(int a) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("1", a);
		return map;
	}
	
	/** 接口中没有定义的方法，在实现类中也可以写  **/
	public void xx() {
		
	}

}
