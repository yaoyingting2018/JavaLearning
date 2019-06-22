package hashmapdemo;

import java.util.HashMap;
import java.util.Set;

public class HashMapWordCount {
	public static void main(String[] args) {
		String str = "a,b,c,d,e,f,g,h,b,b,b,c,x,x,y,x,b";
		String[] words = str.split(",");
		
		HashMap<String, Integer> countMap = new HashMap<>();
		
		for(String ch:words) {
			if(countMap.containsKey(ch)) {
				Integer value = countMap.get(ch);
				countMap.put(ch, value+1);
			}else {
				countMap.put(ch, 1);
			}
		}
		
		/**
		 * 遍历hashmap，打印数据
		 */
		// 先取出所有的key
		Set<String> keySet = countMap.keySet();
		// 然后遍历一个一个的key，去map中取value
		for(String key:keySet) {
			Integer count = countMap.get(key);
			System.out.println(key + "," + count);
			
		}
	}

}
