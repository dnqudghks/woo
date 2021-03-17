package day22;

/*
	PrintWriter ��Ʈ���� �̿��ؼ� ������ �����غ���.
	
	A Drinking Song

William Butler Yeats

Wine comes in at the mouth
And love comes in at the eye;
That��s all we shall know for truth
Before we grow old and die.
I lift the glass to my mouth,
I look at you, and sigh.

 */
import java.io.*;
public class PrintWriterTest {

	public PrintWriterTest() {
		//��Ʈ�� �غ��ϰ�
		//PrintWriter �� ���Ͽ� ���� ������ �� �ִ� ���ͽ�Ʈ���̴�.
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter("src/day22/data/drinkingSong.poem");
			
			//������ ������ ����Ѵ�.
			pw.println("A Drinking Song");
			pw.println();
			pw.println("William Butler Yeats");
			pw.println();
			pw.println("Wine comes in at the mouth");
			pw.println("And love comes in at the eye");
			pw.println("That��s all we shall know for truth");
			pw.println("Before we grow old and die.");
			pw.println("I lift the glass to my mouth,");
			pw.println("I look at you, and sigh.");
			
			System.out.println("�۾� ����");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pw.close();
				//�� ��Ʈ���� ���������� Buffered ��Ʈ���� ������ ó���ϹǷ�
				// close() �� ȣ���ϸ� �ڵ� flush()�� �ȴ�.
		}catch(Exception e) {}
	}
	}
	public static void main(String[] args) {

		new PrintWriterTest();
	}

}
