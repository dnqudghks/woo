package day20;
/*
 	1. �̸��� ���̸� �ѽ����� �� �����͸� Map�� ������ ��
 	����� �����͸� ����ϰ�
 	2. ����� �����͸� ����ϰ�
 	3. ���� ������� �������� ������ ��
 	4. ����ϼ���.
 */
import java.util.*;
public class Test05 {
	private HashMap map;
	public Test05() {
		setData();
		
		//��¿� ����Ʈ �����
		ArrayList list = getList();
		//����Ʈ ����ϰ�
		printList(list);
		System.out.println();
		//�������� ����
		Collections.sort(list, new MySort());
		//����Ʈ ����ϰ�
		printList(list);
		
		System.out.println();
		//�������� ����
		Collections.sort(list, new Comparator(){
			@Override
			public int compare(Object o1, Object o2) {
				int result = 0;
				int age1 = (int)((Map.Entry) o1).getValue(); 
				int age2 = (int)((Map.Entry) o2).getValue(); 
				return age2- age1;
			}
		});
		//����Ʈ ����ϰ�
		printList(list);
		
	}
	
	public class MySort implements Comparator{
		
		@Override
		public int compare(Object o1, Object o2) {
			//�̶� o1�� o2�� Map.Entry Ÿ���� ��ü�̴�
			//���� ���� Map.Entry�� ���� ����ȯ�ϰ�
			Map.Entry e1 = (Map.Entry) o1;
			Map.Entry e2 = (Map.Entry) o2;
			
			//���ı����� �� ������ �����´�. �츮�ǰ��� �����̴ϱ� value�� �����´�.
			Object tmp1 = e1.getValue();
			Object tmp2 = e2.getValue();
			
			//������ �����͸� ������ ���� ����ȯ ���ش�.
			int age1 = (int)tmp1;
			int age2 = (int)tmp2;
			
			int result = age2 - age1;
			return -result;
		}
	}
	// map �ʱ�ȭ �Լ�
	public void setData() {
		map = new HashMap();
		// ������ ä���
		map.put("�캴ȯ", 28);
		map.put("����", 25);
		map.put("����", 24);
		map.put("����", 23);
		map.put("����", 22);
	}
	
	//map�� �����͸� list�� ��ȯ���ִ� �Լ�
	public ArrayList getList() {
		Set set = map.entrySet();
		
		ArrayList list = new ArrayList(set);
		
		return list;
	}
	
	//list�� �Է��ϸ� ������ ������ִ� �Լ�
	public void printList(ArrayList list) {
		for(int i = 0; i < list.size(); i++) {
			Map.Entry ent = (Map.Entry)list.get(i);
			String name = (String)ent.getKey();
			int age = (int)ent.getValue();
			
			//���
			System.out.println(name + " : " + age);
		}
	}
	
	public HashMap getMap() {
		return map;
	}

	public void setMap(HashMap map) {
		this.map = map;
	}


	public static void main(String[] args) {
		new Test05();
	}

}
