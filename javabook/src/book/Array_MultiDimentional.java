package book;

public class Array_MultiDimentional {

	public static void main(String[] args) {
		
		// 5행 3열의 2차원 배열
		int[][] score = new int [5][3];
		// 위의 배열과 아래의 배열은 같다
	/*  int[][] score = new int[5][];
	 	score[0] = new int[3];
	 	score[1] = new int[3];
	 	score[2] = new int[3];
	 	score[3] = new int[3];
	 	score[4] = new int[3];
		*/
	// 배열을 정의할 때 한 차원의 크기가 공백이면
    // 그 공백을 각각 다른 크기로 줄 수 있다
	 	int[][] score2 = new int[5][];
	 	score2[0] = new int[4];
	 	score2[1] = new int[2];
	 	score2[2] = new int[3];
	 	score2[3] = new int[1];
	 	score2[4] = new int[3];
	// 가변배열도 생성과 초기화 동시에 가능
	 	int[][] score3 = {
	 			{100, 100, 99},
	 			{20, 20, 20, 20},
	 			{30},
	 			{40, 3}
	 	};
	 	}
	}
