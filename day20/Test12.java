package day20;

/*
	프로그램에 관련된 정보를 구경해보자
 */
import java.util.*;
public class Test12 {

	public Test12() {
		Properties prop = System.getProperties();
		/*
		 System.getProperties()가 
		 프로그램에 관련된 정보를 Map으로 만들어주는 함수이다.
		 */
		
		Enumeration en = prop.keys();
		while(en.hasMoreElements()) {
			String key = (String)en.nextElement();
			String Value = prop.getProperty(key);
			//출력
			System.out.println()
		}
	}

	public static void main(String[] args) {
		new Test12();
	}

}
