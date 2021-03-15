package day20;

/*
	친구 이름을 키값으로 하고 그친구의 전화번호를 관리하는 Map을 만들어서
	데이터를 꺼내서 출력해보자.
 */
import java.util.*;
public class Test02 {
	private Hashtable tab;
	public Hashtable getTab() {
		return tab;
	}
	public void setTab(Hashtable tab) {
		this.tab = tab;
	}
	public void setTab() { //오버로딩
		tab = new Hashtable();
		tab.put("홍길동", "010-7366-8819");
		tab.put("제니", "010-1111-2222");
		tab.put("로제", "010-2222-3333");
		tab.put("리사", "010-3333-4444");
		tab.put("지수", "010-4444-5555");
	}
	public void toPrint() {
		// Map 계열은 key 값이 있어야 데이터를 꺼내올 수 있으므로
		// key 값들만 모두 꺼내오자.
		Set set = tab.keySet();
		// Iterator로 변환
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			//키값 하나 꺼내오고
			String key = (String)itor.next();
			// tab에서 키값에 해당하는 데이터 꺼내오고
			String val = (String) tab.get(key);
			// 출력하고
			System.out.println(key + " | " + val);
		}
	}
	// keys() 함수 이용해서 출력해주는 함수
	public void toPrint(Hashtable t) {
		// 키값들을 추출하고
		Enumeration en = t.keys();
		// 하나씩 꺼내서 출력한다.
		while(en.hasMoreElements()) {
			String key = (String) en.nextElement();
			// value 꺼내고
			String val = (String)t.get(key);
			//출력하고
			System.out.println(key + " | " + val);
		}
	}
	public Test02() {
		setTab(); // tab 데이터 셋팅
		//데이터 출력
		toPrint();
		
		System.out.println();
		// keys() 함수로 처리 후 출력
		toPrint(tab);
	}
	public static void main(String[] args) {
		new Test02();
	}

}
