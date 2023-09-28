package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaEx5 {

	public static void main(String[] args) {

		Supplier<Integer> s = () -> (int)(Math.random()*100)+1;
		Consumer<Integer> c = i -> System.out.print(i + " ");
		Predicate<Integer> p = i -> i%2 == 0;
		Function<Integer, Integer> f = i -> i/10*10;		// i의 1의 자리를 없애는 방식
		List<Integer> list = new ArrayList<>();
		
		makeRandomList(s, list);
		System.out.println(list);
		printEventNum(p, c, list);
		System.out.println();
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
		
	}

	static <T> List<T> doSomething(Function<T, T> f, List<T> list){
		List<T> newList = new ArrayList<T>(list.size());	//	list의 크기만큼 newList를 만듦
		for(T i : list) {	// list를 훑어서
			newList.add(f.apply(i));		// 1의 자리가 사라진 i를 newList에 추가
		}
		return newList;
	}
	
	static <T> void printEventNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {	// list를 쓱 훑어서 
			if(p.test(i)) {		// 2로 나눠서 나머지가 0인애들(=짝수)이면 
				c.accept(i);	// 걔네를 출력
			}
		}
		System.out.print("]");
	}
											
	static <T> void makeRandomList(Supplier<T> s, List<T> list)	{
		for(int i = 0; i<10; i++) {
			list.add(s.get());	// 1~100 사이의 수를 생성, 그걸 리스트에 추가하는걸 10번 반복
		}
	}
}
