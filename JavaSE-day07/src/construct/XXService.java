package construct;

import java.util.HashMap;

/**
 * 接口中只进行方法的定义，不能有方法实现
 * 那么，这个接口类型是不能被实例化的
 * 接口的作用：就是用来在业务实现类和调用者之间定义一个功能规范
 * @author ThinkPad
 *
 */
public interface XXService {
	public String step1();
	public void step2(String id);
	public HashMap<String,Integer> step3(int a);

}
