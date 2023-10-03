package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> list = null;
		List<String> alist = new ArrayList<>();

		alist.add("one");
		alist.add("two");
		alist.add("three");
		
		list = alist;
		
		LinkedList<String> llist = new LinkedList<>();
		
		llist.add("oneL");
		llist.add("twoL");
		llist.add("threeL");
		
		list = llist;
		list.forEach(item -> System.out.println(item));
	}
}
