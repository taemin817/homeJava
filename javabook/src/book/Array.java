package book;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int[] Arr = {1, 2, 3, 4, 5, 7, 9};
								// Arr 배열의 데이터를 [문자열] 형태로 출력
		System.out.println(Arrays.toString(Arr));
		// [ 1, 2, 3, 4, 5, 7, 9]
		
		
		char[] chArr = {'a', 'b', 'c', 'd'};
		// 문자 하나를 담은 배열 chArr을 출력하면
		System.out.println(chArr);
		// abcd 와 같이 붙여서 출력해준다
	}

}
