package lol;

public class PlayerTest {
	public static void main(String[] args) {
		// ��ʼ��һ��Ӣ������
		Player player1 = new Player();

		//
		player1.setAccount("ɧɧ��С����");
		player1.setHero("����");
		player1.setMissionId("��ŷ����-999");

		// ��װ��
		player1.addEquipment("���߰��");

		// ����
		player1.addKilledSoldier();

		// ��ɱ��ͷ
		player1.addKills();

		// ��������
		player1.addAssistants();

		// ��ʾ��ǰӢ�۵�����
		System.out.println("��ɱ��ͷ����" + player1.getKills());
		System.out.println("����������" + player1.getAssistants());
		System.out.println("Ӣ�۵ȼ���" + player1.getHeroLevel());

		System.out.println("---------------------------------------");

		// ��ɱ��ͷ
		player1.addKills();

		// ��������
		player1.addAssistants();
		player1.addAssistants();

		// ��ɱ��ͷ
		player1.addKills();

		// ����װ��
		player1.addEquipment("�����");
		player1.addEquipment("���׶���");

		// ��ʾ��ǰӢ�۵�����
		System.out.println("��ɱ��ͷ����" + player1.getKills());
		System.out.println("����������" + player1.getAssistants());
		System.out.println("Ӣ�۵ȼ���" + player1.getHeroLevel());
	}

}
