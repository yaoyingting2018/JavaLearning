package lol;

import java.util.ArrayList;

public class Player {
	private String account;
	private String missionId;
	private String hero;
	private ArrayList<String> equipments = new ArrayList<>();
	private int assistants;
	private int kills;
	private int killedSoldiers;
	private int missionScore;
	private int amountScore;
	private int heroLevel;

	public void setAccount(String account) {
		this.account = account;
	}

	public void setMissionId(String missionId) {
		this.missionId = missionId;
	}

	public void setHero(String hero) {
		this.hero = hero;
	}

	// 每加一件装备，用户的英雄当局得分得变化
	public void addEquipment(String equipment) {
		this.equipments.add(equipment);
		// 每增加一件装备，游戏实时得分需要+5分
		this.missionScore += 5;

		// 更新英雄的等级
		this.setHeroLevel();

		// 累计历史得分也需要 +5分
		this.amountScore += 5;
	}

	// 增加助攻数
	public void addAssistants() {

		this.assistants++;

		// 每增加一个助攻，游戏实时得分 需要 +10分
		this.missionScore += 10;

		// 更新英雄的等级
		this.setHeroLevel();

		// 累计历史得分也需要 +10分
		this.amountScore += 10;

	}

	// 增加人头击杀数
	public void addKills() {
		this.kills++;
		this.missionScore += 20;

		// 更新英雄的等级
		this.setHeroLevel();

		this.amountScore += 20;
	}

	// 增加补兵数
	public void addKilledSoldier() {
		this.killedSoldiers++;
		this.missionScore += 2;

		// 更新英雄的等级
		this.setHeroLevel();

		this.amountScore += 2;
	}

	// 更新英雄等级的方法
	private void setHeroLevel() {

		// 更新英雄的等级
		if (this.missionScore < 20) {
			this.heroLevel = 1;
		} else if (this.missionScore < 40) {
			this.heroLevel = 2;
		} else if (this.missionScore < 60) {

			this.heroLevel = 3;
		} else {
			this.heroLevel = 4;
		}
	}

	public String getAccount() {
		return this.account;
	}

	public String getMissionId() {
		return this.missionId;
	}

	public String getHero() {
		return hero;
	}

	public ArrayList<String> getEquipments() {
		return equipments;
	}

	public int getAssistants() {
		return assistants;
	}

	public int getKills() {
		return kills;
	}

	public int getKilledSoldiers() {
		return killedSoldiers;
	}

	public int getMissionScore() {
		return missionScore;
	}

	public int getAmountScore() {
		return amountScore;
	}

	public int getHeroLevel() {
		return heroLevel;
	}


}
