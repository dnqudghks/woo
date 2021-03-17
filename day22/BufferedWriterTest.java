package day22;
/*
	BufferedWriter 스트림을 이용해서
	desert.poem 을 복사해서 desert.txt파일을 만들어보자
 */
import java.io.*;
public class BufferedWriterTest {

	public BufferedWriterTest() {
		//복사를 해야하므로 입출력 스트림 모두 준비한다.
		//입력
		FileReader fr = null;
		BufferedReader br = null;
		
		//출력
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			//스트림 만들고
			//입력
			fr = new FileReader("src/day22/data/desert.poem");
			br = new BufferedReader(fr);
			//출력
			fw = new FileWriter("src/day22/data/desert.txt");
			bw = new BufferedWriter(fw);
			
			// 한쪽에서 읽고 그 결과를 저장하게 된다.
			for(;;) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				bw.write(line + "\r\n");
			}
			System.out.println("파일 저장 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				bw.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {

		new BufferedWriterTest();
	}

}
