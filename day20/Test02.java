package day20;

/*
	ģ�� �̸��� Ű������ �ϰ� ��ģ���� ��ȭ��ȣ�� �����ϴ� Map�� ����
	�����͸� ������ ����غ���.
 */
import java.util.*;
public class Test02 {
	private Hashtable tab;
	public Hashtable getTab() {
		return tab;
	}
	public void setTab(Hashtable tab) {
		this.tab = tab;
	}
	public void setTab() { //�����ε�
		tab = new Hashtable();
		tab.put("ȫ�浿", "010-7366-8819");
		tab.put("����", "010-1111-2222");
		tab.put("����", "010-2222-3333");
		tab.put("����", "010-3333-4444");
		tab.put("����", "010-4444-5555");
	}
	public void toPrint() {
		// Map �迭�� key ���� �־�� �����͸� ������ �� �����Ƿ�
		// key ���鸸 ��� ��������.
		Set set = tab.keySet();
		// Iterator�� ��ȯ
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			//Ű�� �ϳ� ��������
			String key = (String)itor.next();
			// tab���� Ű���� �ش��ϴ� ������ ��������
			String val = (String) tab.get(key);
			// ����ϰ�
			System.out.println(key + " | " + val);
		}
	}
	// keys() �Լ� �̿��ؼ� ������ִ� �Լ�
	public void toPrint(Hashtable t) {
		// Ű������ �����ϰ�
		Enumeration en = t.keys();
		// �ϳ��� ������ ����Ѵ�.
		while(en.hasMoreElements()) {
			String key = (String) en.nextElement();
			// value ������
			String val = (String)t.get(key);
			//����ϰ�
			System.out.println(key + " | " + val);
		}
	}
	public Test02() {
		setTab(); // tab ������ ����
		//������ ���
		toPrint();
		
		System.out.println();
		// keys() �Լ��� ó�� �� ���
		toPrint(tab);
	}
	public static void main(String[] args) {
		new Test02();
	}

}
