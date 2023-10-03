package stream;

import java.util.HashSet;
import java.util.Random;
import java.util.stream.IntStream;

public class Lotto {

	public static void main(String[] args) {

		IntStream s = new Random().ints(1, 46);	// 1이상 46미만
		System.out.println("각각의 요소로 출력");
		s.distinct().limit(6).sorted().forEach(l->System.out.print(l + " "));
		
		HashSet<Integer> lottos = new HashSet<Integer>();
		Random r = new Random();
		System.out.println("\nlottos 집합 생성");
		// 중복제거
		for(int i = 0; i<7; i++) {
			lottos.add(r.nextInt(45)+1		// nextInt로 0이상 45미만을 생성 이후 +1 => 1이상 46미만
												// HashSet의 기능으로 중복없이 추가
			);
		}
		
		System.out.println("size : " + lottos.size());
		
		Object[] lottosArray = lottos.toArray();	// lottos 집합을 배열로 변환
		
		Integer[] result = new Integer[6];	// 크기가 6인 배열 생성
		
		System.arraycopy(lottosArray, 0, result, 0, 6);	// 0번째부터 크기가 6인 배열에 복사
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
