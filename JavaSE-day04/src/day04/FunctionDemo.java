package day04;

import java.util.ArrayList;

public class FunctionDemo {
	public static void main(String[] args) {
		NumberPair pair=new NumberPair();
		pair.a = 10;
		pair.b = 20;
		
		int sum=pair.getSum();
		System.out.println(sum);
		pair.say();
		pair.say("小红");
		pair.say("小华","小红");
		int he=pair.qiuHe(3, 4);
		System.out.println(he);
		ArrayList<Integer> list=new ArrayList<>();
		list.add(8);
		list.add(18);
		list.add(5);
		list.add(44);
		list.add(11);
		
		NumberPair.sort(list);
		pair.print(list);
		
	}

}
