package lamda;

import java.util.function.Supplier;

/* interface Supplier<T>{
		T get();		// 매개변수 없고 반환값만 있다
 	}
*/

public class SupplierTest {

	public static void main(String[] args) {
		//	1.
		Supplier<Integer> S1 = () -> (int)(Math.random()*10);
		int result = S1.get();
		System.out.println(result);
		
		// 2.
		Supplier<String> S2 = () -> {
			int r = (int)((Math.random()*9)+1);
			if( r == 1) {
				return "glgl";
			} else {
				return "히히";
			}
		};
		
		String result2 = S2.get();
		System.out.println(result2);
		
		// 3.
		Supplier<Integer> S3 = new Supplier<>() {
			public Integer get()	{
				return (int)(Math.random()*5);
			}
		};
		int result3 = S3.get();
		System.out.println(result3);
	}
	
}
