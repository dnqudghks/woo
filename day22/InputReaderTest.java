package day22;

/*
	FileInputStream (byte ����) ������ �а�
	BufferedReader (char ����) 
 */
import java.io.*;
public class InputReaderTest {

	public InputReaderTest() {
		// ��Ʈ�� �غ�
		// Ÿ�ٽ�Ʈ��
		FileInputStream fin = null;
		
		//���� ��Ʈ��
		BufferedReader br = null;
		
		//����� ���ͽ�Ʈ��
		InputStreamReader ir = null;
		
		try {
			//��Ʈ�� �����
			fin = new FileInputStream("src/day22/data/desert.poem");
			ir = new InputStreamReader(fin);
			br = new BufferedReader(ir);
			
			while(true) {
				String line = br.readLine();
				if( line == null) {
					break;
				}
				//���� �����͸� �ܼ�ȭ�鿡 �������.
				System.out.println(line);
				
			}
			
			System.out.println();
			System.out.println("�۾�����");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				ir.close();
				fin.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {

		new InputReaderTest();
	}

}
