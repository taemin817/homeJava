package book;

public class ArrayMaxMin {

	public static void main(String[] args) {

		int[] score = { 79, 88, 91, 33, 100, 55, 95 };
		int max = score[0];
		int min = score[0];

		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {	// score[0]이 max(=score[0])보다 크면 최대값
										// score[1]이 max보다 크면 최대값 
										// ... score[6]까지 반복
				max = score[i];
			} else if (score[i] < min) {	// score[0]이 min(=score[0])보다 작으면 최소값
												// score[1]이 min보다 작으면 최대값
												// ... score[6]까지 반복
				min = score[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}