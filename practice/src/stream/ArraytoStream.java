package stream;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraytoStream {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};
		Arrays.stream(arr).forEach(n->System.out.println(n));
		
		// ArrayList to stream
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		list.stream().forEach(str->System.out.println(str));
		System.out.println();
		list.stream().sorted().forEach(str->System.out.println(str));
		System.out.println();
		for(String s : list) {
			System.out.println(s);	// 스트림은 기존 list의 데이터를 변경하지 않음
		}
	}

}
