package hashmapdemo;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		// ����һ��hashmap����
		HashMap<String, String> map1 = new HashMap<>();

		// ��hashmap��������ݣ����key�ظ�����Ḳ��
		map1.put("1", "�װٺ�");
		map1.put("1", "����");

		// �������
		map1.put("2", "����ǿ");
		map1.put("3", "�Ʋ�");
		map1.put("4", "����");
		map1.put("5", null);

		// ��ȡmap�е�����
		String a = map1.get("3");
		System.out.println(a);

		// ��ȡmap�ĳ���
		int size = map1.size();
		System.out.println(size);

		// ��map���Ƴ�����
		String remove = map1.remove("3");
		System.out.println(remove);

		// �ж������Ƿ����
		// ����1����ȥget�Ǹ��Ƶ���key�����Ƿ��ܻ�ȡ��value
		String b = map1.get("5");
		System.out.println(b);

		// ����2����������map��contains�����ж�ָ����key�Ƿ����
		boolean c = map1.containsKey("5"); // �˷�����������ȷ��map���Ƿ����ָ����key
		System.out.println(c);

		// hashmap�ı�����

		Set<String> keySet = map1.keySet();
		for (String id : keySet) {
			System.out.println(map1.get(id));
		}
	}

}
