package abstractdemo;

public class Test {
	public static void main(String[] args) {
		// 创建一个AmericanPerson子类对象，用AmericanPerson类型变量来引用，没问题
		AmericanPerson americanPerson = new AmericanPerson();
		// 也可以用一个父类型Person的变量来引用一个子类AmericanPerson对象，没毛病，只是，变量上就不能用到子类的特别属性或方法了
		// Person americanPerson2 = new AmericanPerson();
		
		americanPerson.age = 18;
		
		americanPerson.hairColor = "黄";
		americanPerson.shualai();
		
		System.out.println(americanPerson.age);
		americanPerson.say();
		
		
		ChinesePerson chinesePerson = new ChinesePerson();
		chinesePerson.say();
		
		
	}
}
