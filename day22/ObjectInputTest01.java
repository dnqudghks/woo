package day22;

/*
	ObjectTest01 에서 저장한 파일 mydata를 읽어서
	변수의 값을 출력해보자.
 */
import java.io.*;
public class ObjectInputTest01 {

	public ObjectInputTest01() {
		//스트림 준비
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		try {
			//스트림 만들고
			fin = new FileInputStream("src/day22/data/mydata.txt");
			oin = new ObjectInputStream(fin);
			
			//클래스를 통채로 읽는다.
			MyData data = (MyData)oin.readObject();
			
			System.out.println(data);
			System.out.println();
		
			//변수 하나씩 출력해보자.
			System.out.println("name  :" + data.getName());
			System.out.println("tel   :" + data.getTel());
			System.out.println("mail  :" + data.getMail());
			System.out.println("addr  :" + data.getAddr());
			System.out.println("age   :" + data.getAge());
			System.out.println("gen   :" + data.getGen());
			System.out.println("height :" + data.getHeight());
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
				oin.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {

		new ObjectInputTest01();
	}

}
