package day20;

import java.util.*;
public class Test13 {

	public Test13() {
		ArrayList<String> list = new ArrayList<String>();
		// 이 리스트는 문자열 데이터만 입력되도록 선언되어있다.
		list.add("루피");
		list.add("쵸파");
		list.add("우솝");
		
		//하나씩 꺼내서 출력해보자
		for(String s : list) {
			//list에는 문자열 데이터만 입력되도록 해놧으므로
			//데이터를 꺼내면 그 데이터는 반드시 문자열일 것이다.
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		new Test13();
	}

}
