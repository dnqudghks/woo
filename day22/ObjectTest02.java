package day22;


import java.io.*;
import java.util.*;
public class ObjectTest02 {

	public ObjectTest02() {
		HashMap map = new HashMap();
		map.put("name", "우병환");
		map.put("tel", "010-7366-8819");
		map.put("mail", "gmail.com");
		map.put("addr", "부평구");
		map.put("gen", '남');
		map.put("age", 28);
		map.put("height", 178);
		
		
		System.out.println("파일저장 성공");
		
		//스트림 준비
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		
		try {
			//스트림만들고
			fout = new FileOutputStream("src/day22/data/map.txt");
			oout = new ObjectOutputStream(fout);
			
			//데이터를 내보낸다.
			oout.writeObject(map);
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oout.close();
				fout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {

		new ObjectTest02();
	}

}
