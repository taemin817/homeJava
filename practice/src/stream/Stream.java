package stream;

import java.util.ArrayList;

public class Stream {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("hi");
		list.add("hello");
		list.add("hello");
		list.add("bye");
		list.add("hi");
		list.add("hello");
		
		// hello와 같은 것이 '몇 개'인지 구하기
		long cnt = list.stream().filter(str->str.equals("hello")).count();
		System.out.println(cnt);	//	3
		System.out.println();
		
		// hello와 같은 문자열 전부 출력
		list.stream().filter(str->str.equals("hello")).forEach(str->System.out.println(str));
		System.out.println();
		
		// 바로 위의 결과 중 위에서 2개만 출력
		list.stream().filter(str->str.equals("hello")).limit(2).forEach(str->System.out.println(str));
		
	}

}
