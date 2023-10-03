package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetListMap {

	public static void main(String[] args) {
		System.out.println("==Set : 중복 불가, 순서 없음==");
		Set<String> set = new HashSet<String>();
		set.add("hi");
		set.add("hi2");
		set.add("hi2");
		
		set.forEach(s -> System.out.println(s));
		
		System.out.println("==List : 중복 가능, 순서 있음==");
		List<String> list = new ArrayList<String>();
		list.add("hi");
		list.add("hi2");
		list.add("hi2");
		
		list.forEach(s2 -> System.out.println(s2));
		
		System.out.println("===== Map => 키 : 값 =====");
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		
		map.forEach((s3, s4) -> System.out.println("key :" + s3 + ", value : " + s4));
		
		Collection<String> collection = null;
		// Iterator : 데이터를 순회하기 위한 표준된 방법을 제공		// iterate 반복
		// List, Set 계열들을 같은 타입으로 다룰 수 있음
		collection = set;
		Iterator<String> i = collection.iterator();
		while(i.hasNext()) {
			System.out.println("collection = set : " + i.next());
		}
		
		collection = list;
		Iterator<String> i2 = collection.iterator();
		while(i2.hasNext()) {
			System.out.println("collection = list : " + i2.next());
		}
	}

}
