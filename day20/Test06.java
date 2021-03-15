package day20;

/*
	TreeMap�� �̸��� Ű������ �ϰ� ���̸� ������ �ϴ� �����͸� �Է�����.
 */

import java.util.*;
public class Test06 {
	private TreeMap map;
	
	public Test06() {
		setData();
		printMap();
	}
	
	// ���� �ʱ�ȭ �Լ�
	public void setData() {
		map = new TreeMap();
		
		map.put("����", 17);
		map.put("����", 17);
		map.put("�κ�", 27);
		map.put("����", 10);
		map.put("���", 17);
	}
	//map�� ������ ������ִ� �Լ�
	public void printMap() {
		//Ű�� �����Ѵ�
		Set set = map.keySet();
		TreeSet keys = new TreeSet(set); 
		
		ArrayList list = new ArrayList(keys);
		for(Object o : list) {
			System.out.println((String) o + " : " + map.get(o));
		}
	}
	
	public TreeMap getMap() {
		return map;
	}

	public void setMap(TreeMap map) {
		this.map = map;
	}

	public static void main(String[] args) {
		new Test06();
	}

}
