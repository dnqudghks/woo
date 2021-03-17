package day22;

/*
 	day22.data.desert.poem �� �о��
 	BufferdReader ��Ʈ���� ����ؼ� �о��
 */
import java.io.*;
public class BufferedReaderTest {

	public BufferedReaderTest() {
		//��Ʈ�� �غ�
		//Ÿ�ٽ�Ʈ�� �غ�(���ͽ�Ʈ���� ����Ϸ��� �ݵ�� Ÿ�ٽ�Ʈ���� �غ�Ǿ�� �Ѵ�.)
		FileReader fr = null;
		//���ͽ�Ʈ�� �غ�
		BufferedReader br = null;
		
		try {
			//Ÿ�ٽ�Ʈ���� ��ġ(����)�� �����Ѵ�.
			fr = new FileReader("src/day22/data/desert.poem");
			//Ÿ�ٽ�Ʈ���� �����ϴ� ���ͽ�Ʈ���� �����.
			br = new BufferedReader(fr);
			
			//����� �о�� ���� �𸣹Ƿ� �ݺ��ؼ� ó���Ѵ�.
			for(;;) {
				String line = br.readLine();
				//readLine() �������� �� ���� �д� �Լ��ε�
				// �ٹٲޱ�ȣ "\r\n"�� ������ ���������� �о�´�.
				if(line == null) {
					//�о�� �����Ͱ� ���� ���
					break;
				}
				System.out.println(line);
				//println()�Լ��� ����� �ٹٲ��� ���ִ� �Լ�.
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {

		new BufferedReaderTest();
	}

}
