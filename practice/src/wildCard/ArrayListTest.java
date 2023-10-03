package wildCard;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		print(list);
		
		ArrayList<Object> list2 = new ArrayList<>();
		list2.add("three");
		list2.add("four");
		print(list2);
		// print2(list2);		// print2는 타입이 String으로 제한. list2의 타입은 Object
	}
	public static void print(ArrayList<? super String> list) {
		list.forEach(String -> System.out.println(String));
	}
	
	public static void print2(ArrayList<String> list) {
		list.forEach(String -> System.out.println(String));
	}
}
