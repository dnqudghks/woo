package day20;

/*
	�л��� �̸��� �̿��ؼ� ����(java, db, web, jsp, spring, total)�� �����ϴ� Map�� ����
	����غ���.
 */

import static java.lang.Math.*;
import java.util.*;
public class Test03 {
	private HashMap map;
	
	public Test03() {
		// ���� ���� �ʱ�ȭ�ϰ�
		map = setData();
		// ����Ѵ�.
		toPrint();
		System.out.println();
		toPrint(map);
	}
	
	// map �ʱ�ȭ���ִ� �Լ�
	public HashMap setData() {
		// ��ȯ�� ���� �����
		// Map �����
		HashMap map = new HashMap();
		// ������ ä���
		map.put("�ڿ��", new Student("�ڿ��", getScore(), getScore(), getScore(), getScore(), getScore()));
		map.put("���¼�", new Student("���¼�", getScore(), getScore(), getScore(), getScore(), getScore()));
		map.put("�����", new Student("�����", getScore(), getScore(), getScore(), getScore(), getScore()));
		map.put("������", new Student("������", getScore(), getScore(), getScore(), getScore(), getScore()));
		map.put("������", new Student("������", getScore(), getScore(), getScore(), getScore(), getScore()));
		
		// Map ��ȯ���ְ�
		return map;
	}
	
	// ������ ������ ������ִ� �Լ�
	public void toPrint() {
		// Ű���� �˾ƾ� �����͸� ������ �����Ƿ� Ű������ ��� ������.
		Set keys = map.keySet();
		// Iterator�� ��ȯ�� ó��
		Iterator itor = keys.iterator();
		// �Ѱ��� ������ ����Ѵ�.
		while(itor.hasNext()) {
			// �ϳ� ������
			Object o = itor.next();
			// ������ ������
			Object obj = map.get(o);
			// ���� Ÿ������ ��������ȯ
			Student stud = (Student) obj;
			// toPrint() ȣ��
			stud.toPrint();
		}
	}
	
	//HashMap�� �Է��ϰ� ȣ���ϸ� ���� ������ ������ִ� �Լ�
	public void toPrint(HashMap m) {
		Set set = m.entrySet();
		/*
		 	�� set �ȿ��� Map.Entry Ÿ���� �����Ͱ� ä���� �ִ�.
		 	Map.Entry�� �̸��׸� VO Ŭ�����̴�.
		 */
		Iterator itor = set.iterator();
		// �����͸� �ϳ��� ������ ����Ѵ�.
		while(itor.hasNext()) {
			Object o = itor.next();
			Map.Entry en = (Map.Entry) o;
			
			
			String key = (String)en.getKey();
			Student val = (Student) en.getValue();
			System.out.println("key : " + key);
			System.out.println(val);
			
		}
	}
	// �����ϰ� ���� ��ȯ���ִ� �Լ�
	public int getScore() {
		return (int)(random()*41 + 60);
	}
	
	public HashMap getMap() {
		return map;
	}
	public void setMap(HashMap map) {
		this.map = map;
	}

	public static void main(String[] args) {
		new Test03();
	}

}
