package lamda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaEx2 {

	public static void main(String[] args) {

		Runnable r = () -> System.out.println("Runnable : 매개변수, 반환값 없음");
		r.run();
		
		Consumer<String> c = i -> System.out.println("Consumer : " + i);
		c.accept("매개변수 있음, 반환값 없음");
		
		Supplier<String> s = () -> "매개변수 없음, 반환값 있음";
		String result = s.get();
		System.out.println("Supplier : " + result);
		
		Predicate<Integer> p = j -> j%3==0;
		boolean result2 = p.test(6);
		System.out.println("Predicate : " + result2);

		Function<Integer,String> f = k -> {
			StringBuilder result3 = new StringBuilder();
		    for (int i = 0; i < k; i++) {
		        result3.append('*');
		    }
		    return result3.toString();
		};
		String result4 = f.apply(10);
		System.out.println(result4);
		
		BiConsumer<Integer, Integer> bc = (bc1, bc2) -> System.out.println("매개변수 : " + bc1 +", " + bc2);
		bc.accept(10, 20);
		
		BiPredicate<Integer, Integer> bp = (bp1, bp2) -> {
			if(bp1%3==0 && bp2%2==0) {
				return true;
			} else {
				return false;
			}
		};
		boolean result5 = bp.test(9, 12);
		System.out.println(result5);
		
		BiFunction<Integer, String, String> bf = (bf1, bf2) -> {
			if(bf1==50 && bf2=="저글링") {
				return "저글링 2마리";
			}
			return "다른 무언가";
		};
		String result6 = bf.apply(50, "저글링");
		System.out.println(result6);
		
	}

}
