package abstractdemo;

public class JapaneseExtendsAbstractPerson extends AbstractPerson{

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("雅蠛蝶");
	}

	public static void main(String[] args) {
		
		JapaneseExtendsAbstractPerson japanese = new JapaneseExtendsAbstractPerson();
		japanese.name = "梅川内酷";  // 属性能从父抽象类中继承
		japanese.age = 10;
		
		japanese.eat();  // 方法能从父抽象类中继承
		
		japanese.say();   
	}
}
