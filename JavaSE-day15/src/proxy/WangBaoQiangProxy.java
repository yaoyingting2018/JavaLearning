package proxy;

public class WangBaoQiangProxy {
	public void act() {
		
		System.out.println("宝宝的出场费先得谈妥...咱先谈好");
		
		WangBaoQiang baobao = new WangBaoQiang();
		baobao.act();
		
		System.out.println("宝宝的影片不能让马蓉的公司去宣传....");
	}
}
