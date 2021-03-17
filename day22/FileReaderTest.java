package day22;

/*
 	FilterWriterTest01 ㅇ서 저장한 파일(day22/data/fwTest.txt)을 읽어보자
 */
import java.io.*;
public class FileReaderTest {

	public FileReaderTest() {
		//타겟스티림 준비하고
		FileReader fr = null;
		try {
			fr = new FileReader("src/day22/data/fwTest.txt");
			
			/*
			//1. 한글자 일어보자
			int ch = fr.read();
			System.out.println((char) ch);
			*/
			
			//2.여러글자 읽어보자
			while(true) {
			char[] buff = new char[1024];
			int len = fr.read(buff); // 입력된 문자배열에 읽은 문자를 채워주고 읽은 문자의 갯수를 반환해준다.
			String str = new String(buff, 0 , len);
			//읽은 문자가 없는 경우는 len에 -1이 기억 된다.
			if( len == -1) {
				//이 경우는 반복문을 종료한다.
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
