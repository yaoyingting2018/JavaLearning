package lol;

public class PlayerTest {
	public static void main(String[] args) {
		// 初始化一个英雄数据
		Player player1 = new Player();

		//
		player1.setAccount("骚骚的小狐狸");
		player1.setHero("剑姬");
		player1.setMissionId("艾欧尼亚-999");

		// 买装备
		player1.addEquipment("亡者板甲");

		// 补兵
		player1.addKilledSoldier();

		// 击杀人头
		player1.addKills();

		// 增加助攻
		player1.addAssistants();

		// 显示当前英雄的数据
		System.out.println("击杀人头数：" + player1.getKills());
		System.out.println("助攻次数：" + player1.getAssistants());
		System.out.println("英雄等级：" + player1.getHeroLevel());

		System.out.println("---------------------------------------");

		// 击杀人头
		player1.addKills();

		// 增加助攻
		player1.addAssistants();
		player1.addAssistants();

		// 击杀人头
		player1.addKills();

		// 又买装备
		player1.addEquipment("复活甲");
		player1.addEquipment("日炎斗篷");

		// 显示当前英雄的数据
		System.out.println("击杀人头数：" + player1.getKills());
		System.out.println("助攻次数：" + player1.getAssistants());
		System.out.println("英雄等级：" + player1.getHeroLevel());
	}

}
