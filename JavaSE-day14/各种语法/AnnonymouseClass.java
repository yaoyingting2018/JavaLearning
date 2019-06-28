package cn.edu360.javase24.day14.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 匿名内部类的使用方式：
 * 可以用一个普通类产生一个匿名子类，然后构造对象  new Person(){};
 * 
 * 也可以用一个接口产生一个匿名实现类，然后构造对象  new Comparator(){//必须实现接口中的方法 };
 * 
 * @author ThinkPad
 *
 */
public class AnnonymouseClass {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.name = "人";
		
		Chinese chinese = new Chinese();
		chinese.name="铁蛋儿";
		
		/**
		 * 对普通类创建匿名内部类
		 */
		Person p = new Person(){};  //  {} 表示一个匿名内部类的类体   //多态： 用父类的变量来引用子类对象
		
		
		Person p2 = new Person(){
			@Override
			public void say() {
				System.out.println("我是美国人:" + this.name);
			}
		}; 
		p2.name="james bond";
		
		
		
		person.say();
		
		chinese.say();
		
		p2.say();
		
		
		
		/**
		 * 对接口使用匿名内部类创建对象
		 */
		
		ArrayList<Person> pList = new ArrayList<>();
		
		Collections.sort(pList,new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				
				return 0;
			}
		});
		
		
		
		
	}

}
