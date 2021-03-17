package day22;

/*
 	FilterWriterTest01 ���� ������ ����(day22/data/fwTest.txt)�� �о��
 */
import java.io.*;
public class FileReaderTest {

	public FileReaderTest() {
		//Ÿ�ٽ�Ƽ�� �غ��ϰ�
		FileReader fr = null;
		try {
			fr = new FileReader("src/day22/data/fwTest.txt");
			
			/*
			//1. �ѱ��� �Ͼ��
			int ch = fr.read();
			System.out.println((char) ch);
			*/
			
			//2.�������� �о��
			while(true) {
			char[] buff = new char[1024];
			int len = fr.read(buff); // �Էµ� ���ڹ迭�� ���� ���ڸ� ä���ְ� ���� ������ ������ ��ȯ���ش�.
			String str = new String(buff, 0 , len);
			//���� ���ڰ� ���� ���� len�� -1�� ��� �ȴ�.
			if( len == -1) {
				//�� ���� �ݺ����� �����Ѵ�.
				break;
			}
			System.out.print(str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{
				fr.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new FileReaderTest();
	}

}
