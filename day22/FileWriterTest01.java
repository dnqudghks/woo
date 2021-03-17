package day22;

/*
	char ������ ���Ͽ� �����͸� �����ϴ� ���α׷��� �ۼ��ϼ���
 */
import java.io.*;
public class FileWriterTest01 {

	public FileWriterTest01() {
		//���Ͽ� ������ ��Ʈ�� �غ�
		FileWriter fw = null;
		try {
			fw = new FileWriter("src/day22/data/fwTest.txt");
			/*
			// 1. �ѱ��� (2byte)�� �����غ���
			char ch = '��';
			fw.write(ch);
			*/
			
			// 2. �������ڸ� �����غ���
			// ������ ���ڿ� �����
			String str = "char ������ ���Ͽ� �����͸� �����ϴ� ���α׷��� �ۼ��غ���";
			
			/*
			// 2-1 ���ڹ迭�� ó���ϴ� ���
			char[] buff = str.toCharArray(); // ���ڿ��� ���ڿ��迭�� ��ȯ���ִ� �Լ�
			fw.write(buff);
			*/
			//2-2 ���ڿ��� �ٷ� ó���Ѵ� ���.
			str= str + " : ���ڿ��� ó���ϴ� ���";
			fw.write(str);
			System.out.println("����Ϸ�");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {

		new FileWriterTest01 ();
	}

}
