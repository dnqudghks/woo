package day22;

/*
	ObjectTest02 에서 저장한 map.txt.
	파일을 읽어서 출력해보자
 */
import java.io.*;
import java.util.*;
public class MapReadTest {
	
	FileInputStream fi = null;
	ObjectInputStream oin = null;
	
	{
		
	try {
		fi = new FileInputStream("src/day22/data/map.txt");
		oin = new ObjectInputStream(fi);
		
		HashMap map = (HashMap) oin.readObject();
		
		System.out.println(map);
		System.out.println("name  :" + map.get("name"));
		System.out.println("tel  :" + map.get("tel"));
		System.out.println("amil  :" + map.get("mail"));
		System.out.println("addr  :" + map.get("addr"));
		System.out.println("gen  :" + map.get("gen"));
		System.out.println("age  :" + map.get("age"));
		System.out.println("height  :" + map.get("height"));
	
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
		fi.close();	
		oin.close();
		}catch(Exception e) {}
	}

}
	public MapReadTest() {
		
	}

	public static void main(String[] args) {

		new MapReadTest();
	}

}
