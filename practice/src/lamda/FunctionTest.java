package lamda;

import java.util.function.Function;

/*
 * interface Function<T, R>{
 * 	R apply(T);		// 하나의 매개변수를 받아 결과를 반환한다
 * */
public class FunctionTest {

	public static void main(String[] args) {
		// 1.
		Function<Integer, Integer> f1 = su -> su * 2;

		int result1 = f1.apply(10);
		System.out.println(result1);

		// 2. 
		Function<Integer, Integer> f2 = new Function<>() {

			@Override
			public Integer apply(Integer t) {

				return t * 2;
			}
		};

		int result2 = f2.apply(200);
		System.out.println(result2);
		
		
		// 3.
		Function<Integer, String> f3 = num -> {
			String re = "";
			for (int i = 1; i <= num; i++) {
				re += "뭐야이게";
			}
			return re;
		};

		String result3 = f3.apply(4);
		System.out.println(result3);

	}

}
