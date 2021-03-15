package day20;

/*
	친구의 이름을 키값으로 이메일을 데이터로 하는 맵을 만들어서
	친구 5명의 데이터를 입력하고
	한명씩 꺼내서 출력해보자.
	entrySet() 사용해서 처리하세요.
 */

import java.util.*;
public class Test04 {
	private HashMap map;
	public Test04() {
		setData();
		printMap();
	}
	
	// map 초기화해주는 함수
	public void setData() {
		//전역변수 초기화
		map = new HashMap();
		
		//데이터 추가
		map.put("우병환", "dnqudghks@gamil.com");
		map.put("로제", "dddd@gamil.com");
		map.put("제니", "ssss@gamil.com");
		map.put("리사", "aaaa@gamil.com");
		map.put("제니", "hhhh@gamil.com");
	}
	//map의 내용을 출력해주는 함수
	public void printMap() {
		//키와 벨류를 Map.Entry에 입력하고 그것들을 Set에 담아서 반환받는다
		Set set = map.entrySet();
		
		//ArrayList로 변환해서
		ArrayList list = new ArrayList(set);
		for(int i = 0; i <list.size(); i++) {
			Object o = list.get(i);
			Map.Entry ent = (Map.Entry) o;
			String key = (String) ent.getKey();
			String value = (String) ent.getValue();
			
			//출력
			System.out.println(key + " - " + value);
		}
	}
	
	public HashMap getMap() {
		return map;
	}

	public void setMap(HashMap map) {
		this.map = map;
	}

	public static void main(String[] args) {
		new Test04();
	}

}
