package lamda;

import java.util.function.Predicate;

/*
interface Predicate<T>{
		Boolean test (T t);		// 매개변수 1개 있고 반환을 true / false로 한다
	}
*/
public class PredicateTest {

	public static void main(String[] args) {
	// 1.
	Predicate<Integer> p1 = (su) -> su%2 == 0;
	boolean result = p1.test(5);
	System.out.println(result);
	

	// 2. stop과 같은 글자인지 대조
	Predicate<String> p2 = (str) -> str.equalsIgnoreCase("STOP");	// equalsIgnoreCase : 대소문자 가리지않고 비교
	boolean result2 = p2.test("stop");
	System.out.println(result2);
	
	
	// 3.
	Predicate<Integer> p3 = new Predicate<>() {

		@Override
		public boolean test(Integer t) {
			if (t > 19) 
				return true;
			else
			return false;
		}
	};
	boolean result3 = p3.test(12);
	System.out.println(result3);
	
	
	}

}
