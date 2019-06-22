package hashmapdemo;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {

		String str1 = "a,b,c,d,e,f,g,h,b,b,b,c,x,x,y,x,b";
		String[] split = str1.split(",");

		HashSet<String> set = new HashSet<>();

		for (String ch : split) {
			set.add(ch);
		}

		for (String ch : set) {
			System.out.println(ch);
		}

	}

}
