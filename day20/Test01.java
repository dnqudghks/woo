package day20;

/*
 	Hashtable 예제
 */
import java.util.*;

public class Test01 {
	public Hashtable tab;
	
	public Test01() {
		
		//Hashtable 만들기
		tab = new Hashtable();
		
		// 데이터 채우기
		tab.put("이름", "홍길동");
	
		/*
		 	Map 계열은 데이터를 입력할 때
		 	그 데이터를 구분하는 키값과 데이터를 
		 	한쌍으로 만들어서 입력해야 한다.
		 */
		tab.put("나이", 18);
		tab.put("전화번호", "010-7366-8819");
		tab.put("키", 178.4);
		
		System.out.println("이름 : " + tab.get("이름"));
		
		tab.put("이름", "고길동");
		System.out.println("이름 : " + tab.get("이름"));
		/*
		 	같은 키값으로 데이터를 입력하면
		 	먼저 저장된 데이터는 삭제되고
		 	새로운 데이터가 입력된다.
		 	즉, 같은 키값은 한개의 데이터만 기억할 수 있다.
		 */
		tab.put("성명", "고길동");
		// 키값이 달라지면 같은 데이터도 입력할 수 잇다.
		System.out.println("성명 : " + tab.get("성명"));
		
		int len = tab.size();
		System.out.println("tab length : " + len);
		
		// 데이터만 추출
		Collection con = tab.values();
		
		// Iterator 로 꺼내오고
		Iterator itor = con.iterator();
		
		// 하나씩 꺼내서 출력
		while(itor.hasNext()) {
			Object o = itor.next();
			if(o instanceof String) {
				String str = (String) o;
				System.out.println("문자열 데이터 :" + str);
			} else if(o instanceof Integer) {
				int no = (int) o;
				System.out.println("정수 데이터 :" + no);
			} else if(o instanceof Double) {
				double num = (double) o; // Unboxing 이 자동처리
				System.out.println("실수 데이터 :" + num);
		
	}
}
	// 키값만 추출
	// 키값을 추출하는 함수는 keys(), keySet()
	Enumeration en = tab.keys();
	//출력
	while(en.hasMoreElements()) {
		Object obj = en.nextElement();
		//우리의 경우 키값이 모두 문자열이기 때문에 문자열로 강제 형변환 해주자.
		String skey = (String) obj;
		System.out.println("key : " + skey);
		//데이터 출력
		System.out.println("value : " + tab.get(skey));
	}
		keyNval();
		System.out.println();
		keyNval2();
	}
	// key와 value를 한쌍으로 꺼내서 출력해주는 함수
	public void keyNval() {
		//전역변수tab 에 기억된 데이터를 Map.Entry타입으로 꺼내보자
		Set data = tab.entrySet();
		// 이 경우 Set 데이터 안에 tab에 담겨있던 키값과 데이터가 한쌍으로 Map.Entry 클래스에 저장되어 있다.
		// Set에는 데이터를 꺼내는 함수가 존재하지 않으므로
		// Iterator나 ArrayList로 변환 후 한개씩 꺼내서 출력해야 한다.
		
		// Iterator로 꺼내는 방법
		Iterator itor = data.iterator();
		while(itor.hasNext()) {
			Object o = itor.next();
			Map.Entry ent = (Map.Entry) o;
			/*
			 	Map.Entry 는 키값과 데이터를 변수로 가지는 VO클래스이다.
			 	따라서 ent안에 기억된 키값과 벨류(데이터)를 함수를 호출해서 꺼내면 된다.
			 */
			System.out.println(ent.getKey() + " | " + ent.getValue());
			
		}
	}
	
	// entrySet()의 결과를 ArrayList로 변환해서 처리하는 함수
	public void keyNval2() {
		Set data = tab.entrySet();
		
		// Set을 ArryaList 로 변환
		ArrayList list = new ArrayList(data);
		// 이때 list에는 Map.Entry 타입의 데이터들이 들어있다.
		for(int i = 0 ; i < list.size(); i++) {
			//데이터 꺼내고
			Map.Entry ent = (Map.Entry)list.get(i);
			// 데이터 꺼내서 출력하고
			System.out.println(ent.getKey() + " | " + ent.getValue());
		}
	}
	public static void main(String[] args){
			new Test01();
	}

}
