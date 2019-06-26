package reflect.demo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HashMap<String, String> applicationContext = new HashMap<>();
		
		/**
		 * 解析配置文件，将所有的接口名及其对应的要调用的实现类名放入一个hashmap中
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("e:/a.txt")));
		String line = "";
		while( (line = br.readLine())!=null  ) {
			//解析配置文件中的每一行
			String[] split = line.split(":");
			applicationContext.put(split[0], split[1]);
		}
		
		
		/**
		 *  先掉一下OneTwoService的实现类的say方法
		 */
		
		Class<?> forName1 = Class.forName(applicationContext.get("OneTwoService"));
		OneTwoService newInstance1 = (OneTwoService) forName1.newInstance();
		newInstance1.say();
		
		
		
		/**
		 * 然后需要调OtherService的实现类的eat方法
		 */
		
		Class<?> forName2 = Class.forName(applicationContext.get("OtherService"));
		OtherService newInstance2 = (OtherService) forName2.newInstance();
		newInstance2.eat();
	}

}
