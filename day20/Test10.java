package day20;
/*
 	sample.txt������ �о Map���� �����غ���
 */
import java.io.*;
import java.util.*;
public class Test10 {
	Properties prop = new Properties();
	/*
	 	Properties�� Map�� ��������
	 	�ܺ���ġ�� �����͸� Map���� ������ �� �ִ�.
	 */
	public Test10() {
		/*
		 	�ܺ� ���ϰ� ������ �����̴�.
		 	
		 */
		FileInputStream fin = null;
		try{
			fin = new FileInputStream("src/day20/sample.txt");
			/*
			 	���� ��θ� �̿��ؼ�
			 	C:\class\java\source\JAVA\src\day20\sample.txt
			 	�ǹ������ �о�ȴ�.
			 	
			 	��Ŭ���� �ȿ� �����͸� ����� �̰��� ��Ŭ���� �ڽ��� ��θ� ���Ӱ� ���ؼ� ó���ϹǷ�
			 	��ó�� ����ص� �ȴ�.
			 */
			//fin�� �ܺ���ġ�� �����Ͱ� ���޵� ����̰�
			//���� �츮�� prop�� ����� �ܺ���ġ�� �����͸� ����Ű�� �ȴ�.
			prop.load(fin);
			//������� ����Ǹ� ������ ������ �о Map���� ó���� ���´�.
		} catch(Exception e) {
			e.printStackTrace();
		}
		//�������ʹ� ��ġ HasgMap�� �����Ͱ� ����� �� ó�� ����ϸ�
		String name = prop.getProperty("name");
		String age = prop.getProperty("age");
		String tel = prop.getProperty("tel");
		String addr = prop.getProperty("addr");
		
		//���
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("��ȭ : " + tel);
		System.out.println("�ּ� : " + addr);
	}

	public static void main(String[] args) {
		new Test10();
	}

}
