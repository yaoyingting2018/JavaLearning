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

	// ÿ��һ��װ�����û���Ӣ�۵��ֵ÷ֵñ仯
	public void addEquipment(String equipment) {
		this.equipments.add(equipment);
		// ÿ����һ��װ������Ϸʵʱ�÷���Ҫ+5��
		this.missionScore += 5;

		// ����Ӣ�۵ĵȼ�
		this.setHeroLevel();

		// �ۼ���ʷ�÷�Ҳ��Ҫ +5��
		this.amountScore += 5;
	}

	// ����������
	public void addAssistants() {

		this.assistants++;

		// ÿ����һ����������Ϸʵʱ�÷� ��Ҫ +10��
		this.missionScore += 10;

		// ����Ӣ�۵ĵȼ�
		this.setHeroLevel();

		// �ۼ���ʷ�÷�Ҳ��Ҫ +10��
		this.amountScore += 10;

	}

	// ������ͷ��ɱ��
	public void addKills() {
		this.kills++;
		this.missionScore += 20;

		// ����Ӣ�۵ĵȼ�
		this.setHeroLevel();

		this.amountScore += 20;
	}

	// ���Ӳ�����
	public void addKilledSoldier() {
		this.killedSoldiers++;
		this.missionScore += 2;

		// ����Ӣ�۵ĵȼ�
		this.setHeroLevel();

		this.amountScore += 2;
	}

	// ����Ӣ�۵ȼ��ķ���
	private void setHeroLevel() {

		// ����Ӣ�۵ĵȼ�
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
