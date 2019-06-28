package cn.edu360.javase24.day14.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * �����ڲ����ʹ�÷�ʽ��
 * ������һ����ͨ�����һ���������࣬Ȼ�������  new Person(){};
 * 
 * Ҳ������һ���ӿڲ���һ������ʵ���࣬Ȼ�������  new Comparator(){//����ʵ�ֽӿ��еķ��� };
 * 
 * @author ThinkPad
 *
 */
public class AnnonymouseClass {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.name = "��";
		
		Chinese chinese = new Chinese();
		chinese.name="������";
		
		/**
		 * ����ͨ�ഴ�������ڲ���
		 */
		Person p = new Person(){};  //  {} ��ʾһ�������ڲ��������   //��̬�� �ø���ı����������������
		
		
		Person p2 = new Person(){
			@Override
			public void say() {
				System.out.println("����������:" + this.name);
			}
		}; 
		p2.name="james bond";
		
		
		
		person.say();
		
		chinese.say();
		
		p2.say();
		
		
		
		/**
		 * �Խӿ�ʹ�������ڲ��ഴ������
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
