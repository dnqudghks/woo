package day20;
/*
 	sample.txt파일을 읽어서 Map으로 저장해보자
 */
import java.io.*;
import java.util.*;
public class Test10 {
	Properties prop = new Properties();
	/*
	 	Properties는 Map의 일종으로
	 	외부장치의 데이터를 Map으로 저장할 수 있다.
	 */
	public Test10() {
		/*
		 	외부 파일과 연결할 예정이다.
		 	
		 */
		FileInputStream fin = null;
		try{
			fin = new FileInputStream("src/day20/sample.txt");
			/*
			 	절대 경로를 이용해서
			 	C:\class\java\source\JAVA\src\day20\sample.txt
			 	의방식으로 읽어도된다.
			 	
			 	이클립스 안에 데이터를 만들면 이것은 이클립스 자신이 결로를 새롭게 정해서 처리하므로
			 	위처럼 사용해도 된다.
			 */
			//fin은 외부장치의 데이터가 전달될 통로이고
			//이제 우리는 prop에 연결된 외부장치의 데이터를 기억시키면 된다.
			prop.load(fin);
			//위명령이 실행되면 파일의 내용을 읽어서 Map으로 처리해 놓는다.
		} catch(Exception e) {
			e.printStackTrace();
		}
		//이제부터는 마치 HasgMap에 데이터가 저장된 것 처럼 사용하면
		String name = prop.getProperty("name");
		String age = prop.getProperty("age");
		String tel = prop.getProperty("tel");
		String addr = prop.getProperty("addr");
		
		//출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화 : " + tel);
		System.out.println("주소 : " + addr);
	}

	public static void main(String[] args) {
		new Test10();
	}

}
