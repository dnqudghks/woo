package day20;

import java.util.*;
public class Test13 {

	public Test13() {
		ArrayList<String> list = new ArrayList<String>();
		// �� ����Ʈ�� ���ڿ� �����͸� �Էµǵ��� ����Ǿ��ִ�.
		list.add("����");
		list.add("����");
		list.add("���");
		
		//�ϳ��� ������ ����غ���
		for(String s : list) {
			//list���� ���ڿ� �����͸� �Էµǵ��� �؇J���Ƿ�
			//�����͸� ������ �� �����ʹ� �ݵ�� ���ڿ��� ���̴�.
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		new Test13();
	}

}