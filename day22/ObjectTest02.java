package day22;


import java.io.*;
import java.util.*;
public class ObjectTest02 {

	public ObjectTest02() {
		HashMap map = new HashMap();
		map.put("name", "�캴ȯ");
		map.put("tel", "010-7366-8819");
		map.put("mail", "gmail.com");
		map.put("addr", "����");
		map.put("gen", '��');
		map.put("age", 28);
		map.put("height", 178);
		
		
		System.out.println("�������� ����");
		
		//��Ʈ�� �غ�
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		
		try {
			//��Ʈ�������
			fout = new FileOutputStream("src/day22/data/map.txt");
			oout = new ObjectOutputStream(fout);
			
			//�����͸� ��������.
			oout.writeObject(map);
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oout.close();
				fout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {

		new ObjectTest02();
	}

}
