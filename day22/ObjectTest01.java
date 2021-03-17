package day22;

/*
	MyData �� ������ ä���� ���Ϸ� �����غ���.
 */
import java.io.*;
public class ObjectTest01 {

	public ObjectTest01() {
		//��Ʈ���غ�
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		
		try {
			//��Ʈ�� �����
			fout = new FileOutputStream("src/day22/data/mydata.txt");
			oout = new ObjectOutputStream(fout);
			
			//������ �����͸� �غ��Ѵ�.
			MyData data = new MyData();
			data.setName("�캴ȯ");
			data.setTel("010-7366-8819");
			data.setMail("gmail.com");
			data.setAddr("����");
			data.setAge(28);
			data.setGen('��');
			data.setHeight(178);
			
			oout.writeObject(data);
			/*
				�̷��� Ŭ���� ��ü�� ������ϴ� ������ 
				����ȭ ��� ǥ���Ѵ�.
			 */
			System.out.println("���� ����");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new ObjectTest01();
	}

}
