package lamda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LamdaEx4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		// list의 모든 요소 출력
		list.forEach(i -> System.out.print(i + " "));		// 0 1 2 3 4 5 6 7 8 9 
		System.out.println();
		
		// list에서 2 or 3의 배수 제거
		list.removeIf(x->x%2==0 || x%3==0);
		System.out.println(list);		// [1, 5, 7]
		
		// list의 각 요소에 10을 곱하기
		list.replaceAll(i->i*10);
		System.out.println(list);		// [10, 50, 70]
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		// map의 모든 요소를 { k, v } 형식으로 출력
		map.forEach((k, v) -> System.out.print("{"+k+", "+v+"} "));		// {1, 1} {2, 2} {3, 3} {4, 4}
		System.out.println();

	}

}
