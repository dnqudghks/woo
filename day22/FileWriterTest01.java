package day22;

/*
	char 단위로 파일에 데이터를 저장하는 프로그램을 작성하세요
 */
import java.io.*;
public class FileWriterTest01 {

	public FileWriterTest01() {
		//파일에 연결할 스트림 준비
		FileWriter fw = null;
		try {
			fw = new FileWriter("src/day22/data/fwTest.txt");
			/*
			// 1. 한글자 (2byte)만 저장해보자
			char ch = '한';
			fw.write(ch);
			*/
			
			// 2. 여러글자를 저장해보자
			// 저장할 문자열 만들고
			String str = "char 단위로 파일에 데이터를 저장하는 프로그램을 작성해보자";
			
			/*
			// 2-1 문자배열로 처리하는 방법
			char[] buff = str.toCharArray(); // 문자열을 문자열배열로 반환해주는 함수
			fw.write(buff);
			*/
			//2-2 문자열을 바로 처리한느 방법.
			str= str + " : 문자열로 처리하는 방법";
			fw.write(str);
			System.out.println("저장완료");
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
