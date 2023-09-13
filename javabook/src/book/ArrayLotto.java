package book;

public class ArrayLotto {

	public static void main(String[] args) {

		int[] lotto = new int[45];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1; // i= 0~ 44, 1~45의 로또를 뽑으려면 +1
		}
		int temp, j = 0;

		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿈
		// 배열은 길이가 45이고 순서는 0~44
		for (int i = 0; i < 6; i++) {	// 0번째부터 5번째까지 
			j = (int) (Math.random() * 45);	
			temp = lotto[i];
			lotto[i] = lotto[j];
			lotto[j] = temp;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.printf("lotto[%d]=%d%n", i, lotto[i]);
		}
	}

}
