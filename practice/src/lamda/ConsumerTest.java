package lamda;

import java.util.function.Consumer;

/*
 interface Consumer{
 		void accept(Object o)		// 매개변수만 있고 반환값이 없다
 		}
 */

public class ConsumerTest {

	public static void main(String[] args) {
		//	1.
		Consumer<String> c1 = str -> System.out.println("진짜 " + str);
		c1.accept("람다람쥐");
		
		//	2.
		Consumer<String> c2 = new Consumer<>() {
			@Override
			public void accept(String t) {
				System.out.println(t + "다람쥐로 만든 치타탑");
			}
		};
		c2.accept("람다람쥐 ");
		
		//	3.
		class R implements Consumer<String>{
			@Override
			public void accept(String t) {
				System.out.println(t + "함수형 인터페이스만 가능");
			}
		}
		R r = new R();
		r.accept("람다식은 ");
		
		//	4.
		Consumer<Integer> c3 = su -> {
			int sum = 0;
			for(int i = 0; i<=su; i++) {
				sum+=i;
			}
			System.out.println("1부터 "+su+"까지의 합 = " + sum);
		};
		c3.accept(10);
	}

}
