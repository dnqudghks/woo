package day22;

/*
	FileInputStream (byte 단위) 파일을 읽고
	BufferedReader (char 단위) 
 */
import java.io.*;
public class InputReaderTest {

	public InputReaderTest() {
		// 스트림 준비
		// 타겟스트림
		FileInputStream fin = null;
		
		//필터 스트림
		BufferedReader br = null;
		
		//연결용 필터스트림
		InputStreamReader ir = null;
		
		try {
			//스트림 만들고
			fin = new FileInputStream("src/day22/data/desert.poem");
			ir = new InputStreamReader(fin);
			br = new BufferedReader(ir);
			
			while(true) {
				String line = br.readLine();
				if( line == null) {
					break;
				}
				//읽은 데이터를 콘솔화면에 출력하자.
				System.out.println(line);
				
			}
			
			System.out.println();
			System.out.println("작업종료");
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
